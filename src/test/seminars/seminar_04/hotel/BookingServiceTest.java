package seminars.seminar_04.hotel;

import main.java.seminars.seminar_04.hotel.BookingService;
import main.java.seminars.seminar_04.hotel.HotelService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class BookingServiceTest {

    @Test
    public void testBookingService() {

        // Создание мока
        HotelService mockHotelService = mock(HotelService.class);

        // Определение поведения мока
        when(mockHotelService.isRoomAvailable(anyInt())).thenAnswer(i -> (Integer) i.getArgument(0) % 2 == 0);

        // Создание экземпляра тестируемого класса с подставленным моком
        BookingService bookingService = new BookingService(mockHotelService);

        // Проверка метода bookRoom() с номером комнаты, который является доступным (чётным)
        assertTrue(bookingService.bookRoom(2));

        // Проверка метода bookRoom() с номером комнаты, который является недоступным (нечётным)
        assertFalse(bookingService.bookRoom(3));

        // Проверка, что метод isRoomAvailable() вызывается два раза
        verify(mockHotelService, times(2)).isRoomAvailable(anyInt());
    }
}