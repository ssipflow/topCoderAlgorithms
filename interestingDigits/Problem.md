#Interesting Digits

* Problem<br/>
숫자 3과 9는 재미있는 성질이 있습니다. 3의 배수의 각 자릿수의 합은 다른 3의 배수가 됩니다.
예를 들어 118 X 3=354이고 3+5+4=12는 3의 배수입니다. 마찬가지로 9의 배수의 각 자릿수의 합은 다른 9의 배수가 됩니다.
예를 들어 75 X 9=675이고 6+7+5=18은 9의 배수입니다.<br/>
어떤 진법에서 이러한 성질을 갖는다고 다른 진법에서 이러한 성질을 가지지는 않습니다.
예를 들어 10진수에서 3은 이러한 성질을 가지지만 5진수에서는 성립하지 않습니다.<br/>
참고)<br/>
예를 들어 3 X 4를 생각해봅시다.<br/>
10진수: 3X4=12, 1+2=3 ...3의 배수<br/>
5진수: 3X4=22, 2+2=4 ...3의 배수가 아님<br/>
base 진법이 주어졌을 때 이러한 성질을 가진 수를 오름차순으로 모두 리턴하세요(다만 0과 1은 제외합니다). 
어떤 수가 이러한 성질을 가지는지 알고자 모든 숫자의 곱을 고려할 필요는 없습니다. 
만약 4자리 미만의 곱으로 성립되면 더 큰 자리에서도 성립된다 할 수 있습니다. 예를 들어 10진수에서는 999보다 큰 숫자를 고려하지 않아도 됩니다.<br/>

* 정의: Class, Method<br/>
Class-> InterestingDigits<br/>
Method-> public int[] digits(int base)<br/>

* 제약조건: 매개변수 범위<br/>
base: 3-30의 정수<br/>

* 예시<br/>
base = 10<br/>
Returns: {3, 9}<br/><br/>
base = 3<br/>
Returns: {2}<br/><br/>
base = 9<br/>
Returns: {2, 4, 8}<br/><br/>
base = 26<br/>
Returns: {5, 25}<br/><br/>
base = 30<br/>
Returns: {29}
