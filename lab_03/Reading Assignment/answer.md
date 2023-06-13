* Question: Is JAVA a Pass by Value or a Pass by Reference programming language?
* Answer: Pass by value

* Question : After the call of swap(jungleDVD, cinderellaDVD) why does the title of these two objects still remain?

* Answer: Because Java is passing by value language, so everything happening inside the function does not affect the value outside the scope of the function

* Question : After the call of changeTitle(jungleDVD, cinderellaDVD.getTitle()) why is the title of the JungleDVD changed?

* Answer : Because "dvd.setTitle(title)" change the reference of dvd to a new DigitalVideoDisc, but the value of jungleDVD is unchanged.
