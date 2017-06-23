# odontogram
A Java library to generate odontogram

=======

## Sample Usage



### Full Example

Source code : [Example.java](https://github.com/pusilkom/odontogram/blob/master/src/main/java/id/ac/ui/pusilkom/Example.java)

![Full Example](https://lh3.googleusercontent.com/z4L3JrAWqP11AkZxWDvNeXbrEj_pbtUrm7Zp2pStGuYsRVr9qMGPJoCwM7HNrfzXFoeV-O5kfHFeb3sXeMbjuAf-D1dr0t2hVUXRKyfBJsA5VJn_nuso_rejPfpQPjYROnLPjbhtzKtS08eqcuPAU4NpTnjOQ-v_k3ojoW0sLmSA3kUCO5bqcBB4-RMK3Jz9r1IgpWznrxlX45K_423oTkztOesn6OdFa2zCObekz3cKYYzEKOKua8GvOXU7zUIjZ_e4RTPxtIe9jJeFVrQzWTBjOADHpvW7gJOy_jTeFdEjwxoQ6vGqIbBC3KrGpn6C80VaFzmLSgb-SFvvfdg8-CA-iWa5_4ObGdU9Wmk6-6W4qZjbf23r68zFkQptfdbQR1aiugjlN7lK7uaUAQ-_5eVF0bImex10tKP5V44Hr9FLYxkbmG_bcf2sXhF2e4Hkggfq8Yg4FpjRskvNd1H7QG6bl0KIFNXZsRtiuDeepXQaKTtvPG08XqBW_vJ_9e16wpmu6meTZERJupqf09A2WN3pW5xjd8MxxDtZQafekdK2yjgwmq4hblcpL29WA5zh1VEuP9N6oL3qGbk9SqawAefu_IQ0cTG2qjoOW64BShrmU09h5ZOck3_JPracTAPLbUOU8yxGcLmcLlp0-48a61LuYZFcNXePLnMcmbFLpw=w640-h400-no)

### Sample Code

![odontogram_14](https://user-images.githubusercontent.com/55460/27057843-14fe971a-4ff8-11e7-9253-08c71bb05a9e.png)
![odontogram_15](https://user-images.githubusercontent.com/55460/27057841-14f91f10-4ff8-11e7-9148-c4fa577bf3b4.png)
![odontogram_18](https://user-images.githubusercontent.com/55460/27057842-14fcb79c-4ff8-11e7-9435-ef9d56740f26.png)
![odontogram_22](https://user-images.githubusercontent.com/55460/27057846-15166e1c-4ff8-11e7-870b-f7f61705d892.png)
![odontogram_26](https://user-images.githubusercontent.com/55460/27057844-15080b6a-4ff8-11e7-9ec6-c13167ed98f5.png)
![odontogram_38](https://user-images.githubusercontent.com/55460/27057845-150ab004-4ff8-11e7-904d-8214238e469a.png)
![odontogram_55](https://user-images.githubusercontent.com/55460/27057847-1531169a-4ff8-11e7-846e-794f3088cc89.png)
![odontogram_454443](https://user-images.githubusercontent.com/55460/27057848-153773aa-4ff8-11e7-8682-a60d90297e2a.png)

<table>
	<tr>
		<th>Preview</th>
		<th>Code</th>
	</tr>
	<tr>
		<td>
			<img src="https://user-images.githubusercontent.com/55460/27057842-14fcb79c-4ff8-11e7-9435-ef9d56740f26.png"/>
		</td>
		<td>
<pre>
Tooth g18 = odontogram.getTooth(18);
Box boxTop18NON = g18.buildBoxForTop(Size.HALF_BOX_HEIGHT);
g18.prependBoxForTop(boxTop18NON); 

boxTop18NON.buildThenAddLayer(Label.class).with("NON");

Box boxCenter18 = g18.buildBoxForTop(Size.BOX_HEIGHT);
g18.replaceBoxForCenter(boxCenter18);

boxCenter18.buildThenAddLayer(Molar.class);
</pre>
		</td>
	</tr>
	<tr>
		<td>
			<img src="https://user-images.githubusercontent.com/55460/27057841-14f91f10-4ff8-11e7-9148-c4fa577bf3b4.png"/>
		</td>
		<td>
<pre>
Tooth g15 = odontogram.getTooth(15);
Box boxCenter15 = g15.buildBoxForTop(Size.BOX_HEIGHT);
g15.replaceBoxForCenter(boxCenter15); 

boxCenter15.buildThenAddLayer(Molar.class);
boxCenter15.buildThenAddLayer(X.class);
</pre>
		</td>
	</tr>
	<tr>
		<td>
			<img src="https://user-images.githubusercontent.com/55460/27057843-14fe971a-4ff8-11e7-9253-08c71bb05a9e.png"/>
		</td>
		<td>
<pre>
Tooth g14 = odontogram.getTooth(14);
Box boxCenter14 = g14.buildBoxForTop(Size.BOX_HEIGHT);
g14.replaceBoxForCenter(boxCenter14);

boxCenter14.buildThenAddLayer(Molar.class);
boxCenter14.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BASIC, Color.BLACK, true);
</pre>
		</td>
	</tr>
</table>

18, 15, 14, 22, 26
55, 

45, 44, 43

38

