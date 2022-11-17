package bridge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    @DisplayName("플레이어를 이동한다.")
    void move() {
        Player player = new Player();
        assertThat(player.move()).isEqualTo(0);
        assertThat(player.move()).isEqualTo(1);
    }

    @Test
    @DisplayName("이동 완료 여부 확인")
    void is_move_complete(){
        Player player = new Player();
        player.move();
        player.move();
        assertThat(player.isCompleted(1)).isFalse();
        assertThat(player.isCompleted(2)).isTrue();
    }
}
