#Cryptography

* Problem<br/>
TopCoder Security Agency(TSA, 오늘 설립되었어요!)는 새로운 암호화 시스템을 개발했습니다. 이 시스템은 암호화하려고 숫자 리스트를 입력받습니다.<br/>
여러분은 TSA의 비밀 정보 수사원입니다. 암호화 과정에서 중요한 부분을 구현하는 것이 여러분의 일입니다. 
여러분은 입력 리스트에서 1개의 값을 선택하고 값을 1 증가시킵니다.
이때 리스트 내부의 모든 숫자 곱이 가장 커져야 합니다.<br/>
int[] number 형태로 숫자 배열이 주어질 때 곱의 최댓값을 리턴하세요.
리턴값이 2<sup>62</sup>를 넘는 문제는 나오지 않을 것을 보장합니다.<br/>

* 정의: Class, Method<br/>
Class-> Cryptography<br/>
Method-> public long encrypt(int[] numbers)<br/>

* 제약조건: 매개변수 범위<br/>
capacities: 2-50개의 요소가 있는 배열이며 각 요소의 값은 1-1000입니다.<br/>
Returns: 2<sup>62</sup>를 넘지 않습니다.<br/>

* 예시<br/>
numbers = {1, 2, 3}<br/>
Returns: 12<br/>
예시검토를 참고하세요.<br/><br/>
numbers = {1, 3, 2, 1, 1, 3}<br/>
Returns: 36<br/>
numbers 배열처럼 숫자는 중복될 수도 있습니다.<br/><br/>
numbers = {1000, 999, 998, 997, 996, 995}<br/>
Returns: 986074810223904000<br/>
숫자는 굉장히 클 수 있습니다. 다만 2<sup>62</sup>를 넘지 않습니다.<br/><br/>
numbers = {1, 1, 1, 1}<br/>
Returns:2
