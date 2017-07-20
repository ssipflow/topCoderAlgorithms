#Interesting Party

* Problem <br/>
화이트씨는 다재다능한 사랍입니다(모든 것이 그의 관심 대상입니다). 그래서 그에게는 친구가 많습니다. 하지만 불행하게도 그의 친구들은 다재다능하지 않습니다. 
그래서 파티를 개최할 때마다 모두가 즐겁게 파티를 보내려면 어떤 친구를 초대할지가 큰 문제입니다. 
화이트씨는 그 동안의 경험으로 초대된 친구 모두가 공통의 흥미 있는 화제가 있을 때 파티를 즐긴다는 것을 알았습니다. <br/>
문자열 배열 first, second가 주어집니다. 화이트씨의 i번쨰 친구가 흥미 있는 화제는 first[i]와 second[i]입니다.
즐거운 파티가 되려면 화이트씨가 초대할 수 있는 친구는 최대 몇 명인지 리턴하세요.<br/>

* 정의: Class, Method<br/>
Class-> InterestingParty<br/>
Method-> public int bestInvitation(String[] first, String[] second)<br/>

* 제약조건: 매개변수 범위<br/>
first: 1-50개의 요소를 갖는 배열<br/>
second: first와 같은 크기의 배열<br/>
first, second 공통: 각 요소는 1-15개의 문자이며, 각 문자는 영어 소문자. i번쨰 요소 first[i]와 second[i]의 내용은 다르다.<br/>

* 예시<br/>
first = {"fishing", "gardening", "swimming", "fishing"}<br/>
second = {"hunting", "fishing", "fishing", "biting"}<br/>
Returns: 4<br/><br/>
first = {"variety", "diversity", "loquacity", "courtesy"}<br/>
second = {"talking", "speaking", "discussing", "meeting"}<br/>
Returns: 1<br/><br/>
first = {"snakes", "programming", "cobra", "monty"}<br/>
second = {"python", "python", "anaconda", "python"}<br/>
Returns: 3<br/><br/>
first = {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"}<br/>
second ={"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"}<br/>
Returns: 6
