# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 요구사항 명세서

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - [ ] 자동차 경주가 진행하여 자동차들의 위치들을 리턴한다
    - [ ] 자동차를 전진시키면 위치가 한칸 증가한다
    - [ ] 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진한다.
    - [ ] 3 이하의 값이면 멈춘다.
- 각 자동차에 이름을 부여할 수 있다.
    - [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    - [ ] 입력받은 이름이 5자이상인 경우 예외 처리한다.
    - [ ] 자동차 생성 시 이름이 5글자이하인 경우 예외가 발생하지 않는다
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - [ ] 4이상인 경우에만 전진을한다
    - [ ] RacingCar 에 등록된 모든 자동차가 조건에 맞는 경우 전진한다
    - [ ] 필요한 자동차 개수만큼 자동차들이 만들어진다
    - [ ] 만들어야하는 자동차 개수가 0미만인 경우 예외처리한다
    - [ ] 경주가 끝난 후 우승자를 찾는다
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 
    - [ ] 우승자는 한 명 이상일 수 있다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
