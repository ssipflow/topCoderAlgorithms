#KiwiJuiceProblem

* Problem <br/>
타로는 맛있는 키위 주스를 준비했습니다. 타로는 0부터 N-1이라 이름을 붙인 N개의 병에 키위 주스를 넣었습니다. 
이때 i번째의 병의 용량을 capacities[i] 리터이며 타로가 i번째 병에 넣은 키위 주스의 양을 bottles[i] 리터라고 합니다. <br/><br/>
타로는 병에 키위 주스를 재분배하려고 하며, 0부터 M-1까지 M회 조작합니다.
병 fromId[i]가 비어있거나 병 toId[i]가 꽉 차 있는 순간, 타로는 더 이상 키위 주스를 넣지 않습니다.<br/><br/>
N개의 요소를 가진 정수 배열 int[]를 리턴해주세요.
배열의 i번째 요소는 모든 주스를 쏟는 작업이 완료되고 i번째 병에 남아 있는 키위 주스의 양입니다.<br/>

* 정의: Class, Method <br/>
Class -> KiwiJuiceEasy <br/>
Method -> Java: public int[] the Pouring ( int[] capacities, int[] bottles, int[] fromId, int[] toId ) <br/>

* 제약조건<br/>
capacities: 2-50개의 요소가 있는 배열. 각 요소는 1-1000000 사이의 값을 갖는다.<br/>
bottles: capacities와 같은 수의 요소가 있는 배열. bottles[i]는 capacities[i]에 들어있는 주스.<br/>
fromId: 1-50개의 요소가 있는 배열.<br/>
toId: fromId와 같은 수의 요소가 있는 배열.<br/>
변수 fromId와 toId는 0~(N-1) 사이의 값. 이때 N은 변수 capacities의 항목 개수다. 변수 fromId[i]와 toId[i]는 서로 다른값을 갖는다.<br/>

* 예시<br/>
capacities = {20, 20}<br/>
bottles = {5, 8}<br/>
fromId = {0}<br/>
toId = {1}<br/>
Returns: {0, 13} <br/><br/>
capacities = {10, 10}<br/>
bottles = {5, 8}<br/>
fromId = {0}<br/>
toId = {1}<br/>
Returns: {0, 13} <br/><br/>
capacities = {30, 20, 10}<br/>
bottles = {10, 5, 5}<br/>
fromId = {0, 1, 2}<br/>
toId = {1, 2, 0}<br/>
Returns: {10, 10, 0} <br/><br/>
capacities = {14, 35, 86, 58, 25, 62}<br/>
bottles = {6, 34, 27, 38, 9, 60}<br/>
fromId = {1, 2, 4, 5, 3, 3, 1, 0}<br/>
toId = {0, 1, 2, 4, 2, 5, 3, 1}<br/>
Returns: {0, 14, 65, 35, 25, 35} <br/><br/>
capacities = {700000, 800000, 900000, 1000000}<br/>
bottles = {478478, 478478, 478478, 478478}<br/>
fromId = {2, 3, 2, 0, 1}<br/>
toId = {0, 1, 1, 3, 2}<br/>
Returns: {0, 156956, 900000, 856956}
