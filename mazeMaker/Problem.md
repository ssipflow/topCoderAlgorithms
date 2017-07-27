#MazeMaker

* Problem<br/>
최근 미로를 만드는 장인인 마이크는 마당에 거대한 미로를 만들었습니다.
미로에 있는 i번째 행의 j번째 열을 나무가 있어서 지나갈 수 없는 경우 'X'로,
지나갈 수 있는 경우 '.'으로 표시했습니다.
마이크는 미로를 잘 빠져나가는 친구 짐에게 미로를 풀 것을 부탁했습니다.
짐은 startRow행의 startCol열에서 미로를 시작합니다.<br/>
일반적인 미로 탈출 방법과 달리 미로를 단순하게 걷는 것이 아니라 뛰어넘어 다닙니다.
짐이 이동할 수 있는 이동형태는 moveRow와 moveCol에 기록되어 있습니다.
i번째 요소는 짐이 이동할 수 있는 움직임 입니다.
짐은 현재 위치에서 moveRow[i]행과 moveCol[i]열 만큼 이동할 수 있습니다.
예를들어 moveRow = {1, 0, -1}와 moveCol = {3, -2, 5}라면 짐은 (1, 3), (0, -2), (-1, 5) 형태로 이동할 수 있습니다
(그러나 짐은 미로 밖으로 나갈 수 없으며 나무로 이동할 수도 없습니다).<br/>
마이크는 짐이 미로에서 나오지 못하게 하고 싶습니다. 
마이크는 미로의 어떤 '.' 위치에나 출구를 놓을 수 있습니다.
만약 미로에서 나오지 못하게 할 수 없다면 가능한 짐의 이동거리가 길어지게 하려고 합니다.
짐은 미로에서 항상 최단 경로로 탈출한다고 할 때 짐이 미로에서 벗어날 수 있는 최대 이동 횟수를 리턴하세요.
미로를 빠져나올 수 없는 경우에는 -1을 리턴해 주세요.<br/><br/>

* 정의: Class, Method<br/>
Class: MazeMaker<br/>
Method: public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol)<br/><br/>

* 제약조건: 매개변수 범위<br/>
maze<br/>
: 1-50개의 요소가 있는 배열<br/>
: 각 요소는 길이가 1-50인 문자열<br/>
: 각 요소의 문자 수는 같습니다.<br/>
: 각 문자는 '.' 또는 'X'<br/>
: 요소는 최소 2개의 '.'이 있어야 합니다.<br/>
startRow: 0&#126;N-1, N은 maze 요소 수<br/>
startCol: 0&#126;M-1, M은 maze 요소의 문자 수<br/>
maze[startRow][startCol]: '.'<br/>
moveRow: 1&#126;50개의 요소가 있는 배열<br/>
moveCol: moveRow와 같은 요소 수가 있는 배열<br/>
moveRow, moveCol 공통: 각 요소는 -50&#126;50의 정수<br/><br/>

* 예시<br/>
maze = {"...', "...", "..."}<br/>
startRow = 0<br/>
startCol = 1<br/>
moveRow = {1, 0, -1, 0}<br/>
moveCol = {0, 1, 0, -1}<br/>
Returns: 3<br/><br/>
maze = {"...', "...", "..."}<br/>
startRow = 0<br/>
startCol = 1<br/>
moveRow = {1, 0, -1, 0, 1, 1, -1, -1}<br/>
moveCol = {0, 1, 0, -1, 1, -1, 1, -1}<br/>
Returns: 2<br/><br/>
maze = {"X.X', "...", "XXX", "X.X"}<br/>
startRow = 0<br/>
startCol = 1<br/>
moveRow = {1, 0, -1, 0}<br/>
moveCol = {0, 1, 0, -1}<br/>
Returns: -1<br/><br/>
maze = {".......', "X.X.X..", "XXX...X", "....X..", "X....X.", "......."}<br/>
startRow = 5<br/>
startCol = 0<br/>
moveRow = {1, 0, -1, 0, -2, 1}<br/>
moveCol = {0, -1, 0, 1, 3, 0}<br/>
Returns: 7<br/><br/>
maze = {".......'}<br/>
startRow = 0<br/>
startCol = 0<br/>
moveRow = {1, 0, 1, 0, 1, 0}<br/>
moveCol = {0, 1, 0, 1, 0, 1}<br/>
Returns: 6<br/><br/>
maze = {"..X.X.X.X.X.X."}<br/>
startRow = 0<br/>
startCol = 0<br/>
moveRow = {2, 0, -2, 0}<br/>
moveCol = {0, 2, 0, -2}<br/>
Returns: -1<br/><br/>
