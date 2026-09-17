# Air-Line
Air Line System
Saudi Arabian Airlines Baggage Calculator (Java) ✈️
برنامج جافا بسيط يُحسب تكلفة الوزن الزائد للأمتعة في خطوط الطيران السعودية بناءً على درجة السفر (Degree/Class) وعدد المسافرين المقسمين في مجموعات.

📋 فكرة المشروع
يقوم البرنامج بحساب تكلفة الأمتعة الإضافية للمسافرين حسب الدرجة:

درجة أولي (First Class - F): الحد المسموح به 30 كجم.

درجة رجال الأعمال (Business Class - B): الحد المسموح به 25 كجم.

الدرجة السياحية (Economy Class - E): الحد المسموح به 20 كجم.

تكلفة الكيلوجرام الزائد: 10 ريال سعودي (SAR) لكل 1 كجم زائد عن الحد المسموح.

⚙️ طريقة العمل (Workflow)
إدخال عدد المجموعات (Groups).

لكل مجموعة، يتم إدخال عدد المسافرين بها.

لكل مسافر، يتم طلب:

درجة السفر: (F أو B أو E).

وزن الأمتعة: (بالكيلوجرام).

يقوم البرنامج بمقارنة الوزن بالحد المسموح حسب الدرجة، وحساب التكلفة الزائدة إن وجدت.

🛠️ المفاهيم البرمجية المستخدمة
Scanner: لاستقبال المدخلات من المستخدم.

Nested Loops (for): للتكرار على المجموعات والركاب داخل كل مجموعة.

Switch Case: للتحكم في تدفق البرنامج بناءً على درجة السفر (F, B, E).

Conditional Statements (if-else): للتحقق مما إذا كان الوزن يتجاوز الحد المسموح وحساب الغرامة.

🚀 كيفية التشغيل
تأكد من تثبيت الـ JDK على جهازك.

قم بتشغيل الأمر التالي لترجمة الكود:

Bash
javac Main.java
تشغيل البرنامج:

Bash
java Main
📝 مثال على التشغيل (Sample Run)
Plaintext
Entre the number of groups 
1
Enter the number of Passengers G 1
1
Welcome to Saudi Arabian AirLines ! 
HI Passenger Number : 1
Entre Your class : 
(F)  (B)  (E)
E
What is the weight of the bags ?
Weight is : 
25
The weight of the bags is greater than 20kg.
overweight:5
The cost = 50 SAR
