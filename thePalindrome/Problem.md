#The Palindrome

* Problem<br/>
존과 브루스는 대학에서 문자열 이론을 공부하고 있습니다. 브루스는 회문을 아주 좋아합니다.
회문은 앞에부터 읽으나, 뒤에서부터 읽으나 같은 단어를 말합니다. 
존은 브루스를 임의의 문자열 s로 회문을 만들어 브루스를 깜짝 놀래켜주고 싶습니다. 
이때 존은 문자열 s 뒤에 0개 이상의 숫자를 추가해 회문을 생성하려고 합니다. 
존이 생성할 수 있는 가장 짧은 회문의 길이를 리턴하세요.<br/>

* 정의: Class, Method<br/>
Class-> The Palindrome<br/>
Method-> public int find(String s)<br/>

* 제약조건: 매개변수 범위<br/>
s: 영어 소문자('a'-'z')로 구성된 1-50글자의 문자열<br/>

* 예시<br/>
s = "abab"<br/>
Returns: 5<br/><br/>
s = "abacaba"<br/>
Returns: 7<br/><br/>
s = "qwerty"<br/>
Returns: 11<br/><br/>
s = "abdfhdyrbdbsdfghjkllkjhgfds"<br/>
Returns: 38
