#FriendScore

* Problem<br/>
여러분은 소셜 네트워크 서비스에서 가장 인기 있는 사람을 찾으려고 합니다.
이를 위해 "친구의 수"를 셉니다. 일단 그들이 서로 친구라면 친구입니다.
또한 C 사람이 A 사람과 B 사람의 공통 친구라면 A 사람과 B 사람도 친구입니다.
가장 인기 있는 사람은 친구의 수가 가장 많은 사람입니다(가장 많은 "친구의 수"를 가진 사람은 여러 명 있을 수도 있습니다.)<br/>
문자열 자료형의 배열 String[] friends가 주어집니다.
만약 i번째 사람과 j번째 사람이 친구라면 i번째 요소의 j번째 글자가 'Y'입니다.
반면 친구가 아니라면 'N'입니다.
소셜 네트워크 서비스에서 가장 인기 있는 사람의 친구 수를 리턴해주세요.<br/>

* 정의: Class, Method<br/>
Class-> FriendScore<br/>
Method-> public int highestScore(String[] friends)<br/>

* 제약조건: 매개변수 
friends<br/>
1-50개의 요소를 갖는 배열<br/>
각 요소는 반드시 배열의 크기 N개만큼 'Y'또는 'N'이 있습니다.<br/>
모든 i, j에 대해 friends[i][j]는 friends[j][i]와 같은 값을 갖습니다.<br/>
모든 i에 대해 friends[i][j]는 'N'입니다.<br/>

* 예시
friends = {"NNN", "NNN, "NNN"}<br/>
Returns: 0<br/><br/>
friends = {"NYY", "YNY", "YYN"}<br/>
Returns: 2<br/><br/>
friends = {"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"}<br/>
Returns: 4<br/><br/>
friends = {"NNNNYNNNNN", "NNNNYNYYNN", "NNNYYYNNNN", "NNYNNNNNNN", "YYYNNNNNY", "NNYNNNNNYN", "NYNNNNNYNN", "NYNNNNYNNN", 
"NNNNNYNNNN", "NNNNYNNNNN"}<br/>
Returns: 8<br/><br/>
friends = {"NNNNNNNNNNNNNNY" , "NNNNNNNNNNNNNNN" , "NNNNNNNYNNNNNNN" , "NNNNNNNYNNNNNNY" , "NNNNNNNNNNNNNNY" , 
"NNNNNNNNYNNNNNN" , "NNNNNNNNNNNNNNN" , "NNYYNNNNNNNNNNN" , "NNNNNYNNNNNYNNN" , "NNNNNNNNNNNNNNY" , 
"NNNNNNNNNNNNNNN" , "NNNNNNNNYNNNNNN" , "NNNNNNNNNNNNNNN" , "NNNNNNNNNNNNNNN" , "YNNYYNNNNYNNNNN"}<br/>
Returns: 6
