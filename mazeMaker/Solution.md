1. 현재 위치한 칸으로부터 다른 칸으로 이동할 수 있는 모든 경로를 찾는다<br/>
2. 각 칸에 몇 번 만에 이동해왔는지를 적는다.<br/>
3. 다른 칸에서부터 이동할 수 있는 모든 경로를 찾는다.<br/>
3-1. 이때 칸에 써 있는 이동 횟수가 이번 이동 횟수보다 크면 이동 횟수를 덮어 씌우고 계속 이동.<br/>
3-2. 그렇지 않다면 이미 최소 이동거리가 구해진 상태이므로 다른 경로를 검사
