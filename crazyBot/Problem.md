#CrazyBot

* Problem<br/>
고장난 로봇이 평면 위에 있습니다. 그리고 n번 움직입니다.
로봇은 각 단계에서 한 방향(동, 서, 남, 북) 중에 한 방향을 랜덤하게 선택해서 한 칸 움직입니다.
로봇이 동, 서, 남, 북을 선택할 확률은 north, south, east, west% 입니다.<br/>
로봇이 임의로 이동하며 같은 지점을 통과하지 않으면 성공했다고 합니다(참고로 로봇의 시작 지점은 항상 1번째 통과 지점이 됩니다).
로봇이 성적으로 보행할 확률을 double 자료형으로 리턴해주세요.
예를 들어 "EENE" 또는 "ENW"는 성공이지만, "ENWS" 또는 "WWWWSNE"는 성공이 아닙니다
('E', 'W', 'S', 'N'는 각각 동, 서, 남, 북을 나타냅니다).<br/><br/>

* 정의: Class, Method<br/>
Class-> CrazyBot<br/>
Method-> public double getProbability(int n, int east, int west, int south, int north)<br/><br/>

* 제약조건: 매개변수 범위<br/>
n: 1-14<br/>
east: 0-100<br/>
west: 0-100<br/>
south: 0-100<br/>
north: 0-100<br/>
east, west, south, north의 합계는 100입니다.<br/><br/>

* 예시<br/>
n = 1<br/>
east = 25<br/>
west = 25<br/>
south = 25<br/>
north = 25<br/>
Returns: 1.0<br/><br/>
n = 2<br/>
east = 25<br/>
west = 25<br/>
south = 25<br/>
north = 25<br/>
Returns: 0.75<br/><br/>
n = 7<br/>
east = 50<br/>
west = 0<br/>
south = 0<br/>
north = 50<br/>
Returns: 1.0<br/><br/>
n = 14<br/>
east = 50<br/>
west = 50<br/>
south = 0<br/>
north = 0<br/>
Returns: 2/(2<sup>14</sup>)<br/><br/>
n = 14<br/>
east = 25<br/>
west = 25<br/>
south = 25<br/>
north = 25<br/>
이동할 수 있는 범위가 넓으므로 확률이 작게 나옵니다.<br/>
