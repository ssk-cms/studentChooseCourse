# studentChooseCourse
Java + spring + springboot + mybatis学生 - 登录后完善个人信息 - 选课教师 - 登录后完善个人信息 - 添加课程 - 查看已选学生列表 - 管理课程管理员 - 管理用户登录信息 - 管理学生信息 - 管理教师信息 - 管理课程信息 - 查看学生选课列表 - 课程管理

运行文件时，请修改src/mian/application.yml中的数据库配置信息
运行src/main/java/com/example/demo/DemoApplication.java 即可启动项目

students
├─ .gitignore
├─ .idea
│    ├─ artifacts
│    │    ├─ students_jar.xml
│    │    ├─ students_war.xml
│    │    └─ students_war_exploded.xml
│    ├─ compiler.xml
│    ├─ encodings.xml
│    ├─ libraries
│    │    ├─ Maven__ch_qos_logback_logback_classic_1_2_3.xml
│    │    ├─ Maven__ch_qos_logback_logback_core_1_2_3.xml
│    │    ├─ Maven__com_baomidou_mybatisplus_spring_boot_starter_1_0_5.xml
│    │    ├─ Maven__com_fasterxml_classmate_1_4_0.xml
│    │    ├─ Maven__com_fasterxml_jackson_core_jackson_annotations_2_9_0.xml
│    │    ├─ Maven__com_fasterxml_jackson_core_jackson_core_2_9_8.xml
│    │    ├─ Maven__com_fasterxml_jackson_core_jackson_databind_2_9_8.xml
│    │    ├─ Maven__com_fasterxml_jackson_datatype_jackson_datatype_jdk8_2_9_8.xml
│    │    ├─ Maven__com_fasterxml_jackson_datatype_jackson_datatype_jsr310_2_9_8.xml
│    │    ├─ Maven__com_fasterxml_jackson_module_jackson_module_parameter_names_2_9_8.xml
│    │    ├─ Maven__com_github_penggle_kaptcha_2_3_2.xml
│    │    ├─ Maven__com_jayway_jsonpath_json_path_2_4_0.xml
│    │    ├─ Maven__com_jhlabs_filters_2_0_235_1.xml
│    │    ├─ Maven__com_vaadin_external_google_android_json_0_0_20131108_vaadin1.xml
│    │    ├─ Maven__com_zaxxer_HikariCP_3_2_0.xml
│    │    ├─ Maven__javax_annotation_javax_annotation_api_1_3_2.xml
│    │    ├─ Maven__javax_servlet_javax_servlet_api_4_0_1.xml
│    │    ├─ Maven__javax_validation_validation_api_2_0_1_Final.xml
│    │    ├─ Maven__junit_junit_4_12.xml
│    │    ├─ Maven__mysql_mysql_connector_java_8_0_15.xml
│    │    ├─ Maven__net_bytebuddy_byte_buddy_1_9_10.xml
│    │    ├─ Maven__net_bytebuddy_byte_buddy_agent_1_9_10.xml
│    │    ├─ Maven__net_minidev_accessors_smart_1_2.xml
│    │    ├─ Maven__net_minidev_json_smart_2_3.xml
│    │    ├─ Maven__org_apache_logging_log4j_log4j_api_2_11_2.xml
│    │    ├─ Maven__org_apache_logging_log4j_log4j_to_slf4j_2_11_2.xml
│    │    ├─ Maven__org_apache_tomcat_embed_tomcat_embed_core_9_0_16.xml
│    │    ├─ Maven__org_apache_tomcat_embed_tomcat_embed_el_9_0_16.xml
│    │    ├─ Maven__org_apache_tomcat_embed_tomcat_embed_websocket_9_0_16.xml
│    │    ├─ Maven__org_assertj_assertj_core_3_11_1.xml
│    │    ├─ Maven__org_hamcrest_hamcrest_core_1_3.xml
│    │    ├─ Maven__org_hamcrest_hamcrest_library_1_3.xml
│    │    ├─ Maven__org_hibernate_validator_hibernate_validator_6_0_14_Final.xml
│    │    ├─ Maven__org_jboss_logging_jboss_logging_3_3_2_Final.xml
│    │    ├─ Maven__org_mockito_mockito_core_2_23_4.xml
│    │    ├─ Maven__org_mybatis_mybatis_3_5_0.xml
│    │    ├─ Maven__org_mybatis_mybatis_spring_2_0_0.xml
│    │    ├─ Maven__org_mybatis_spring_boot_mybatis_spring_boot_autoconfigure_2_0_0.xml
│    │    ├─ Maven__org_mybatis_spring_boot_mybatis_spring_boot_starter_2_0_0.xml
│    │    ├─ Maven__org_objenesis_objenesis_2_6.xml
│    │    ├─ Maven__org_ow2_asm_asm_5_0_4.xml
│    │    ├─ Maven__org_skyscreamer_jsonassert_1_5_0.xml
│    │    ├─ Maven__org_slf4j_jul_to_slf4j_1_7_25.xml
│    │    ├─ Maven__org_slf4j_slf4j_api_1_7_25.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_autoconfigure_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_configuration_processor_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_jdbc_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_json_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_logging_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_test_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_tomcat_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_starter_web_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_test_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_boot_spring_boot_test_autoconfigure_2_1_3_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_aop_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_beans_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_context_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_core_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_expression_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_jcl_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_jdbc_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_test_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_tx_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_web_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_springframework_spring_webmvc_5_1_5_RELEASE.xml
│    │    ├─ Maven__org_xmlunit_xmlunit_core_2_6_2.xml
│    │    └─ Maven__org_yaml_snakeyaml_1_23.xml
│    ├─ misc.xml
│    ├─ modules.xml
│    ├─ uiDesigner.xml
│    └─ workspace.xml
├─ .mvn
│    └─ wrapper
│           ├─ MavenWrapperDownloader.java
│           ├─ maven-wrapper.jar
│           └─ maven-wrapper.properties
├─ HELP.md
├─ log
│    ├─ manage.2019-03-18.log
│    ├─ manage.2019-03-19.log
│    ├─ manage.2019-03-20.log
│    ├─ manage.2019-03-21.log
│    ├─ manage.2019-03-22.log
│    ├─ manage.2019-03-25.log
│    ├─ manage.2019-03-26.log
│    ├─ manage.2019-03-27.log
│    ├─ manage.2019-03-28.log
│    ├─ manage.2019-04-01.log
│    ├─ manage.2019-04-02.log
│    ├─ manage.2019-04-03.log
│    ├─ manage.2019-04-04.log
│    ├─ manage.2019-04-08.log
│    ├─ manage.2019-04-09.log
│    ├─ manage.2019-04-10.log
│    ├─ manage.2019-04-11.log
│    ├─ manage.2019-04-12.log
│    ├─ manage.2019-04-15.log
│    ├─ manage.2019-04-17.log
│    ├─ manage.2019-04-18.log
│    ├─ manage.2019-04-19.log
│    ├─ manage.2019-04-22.log
│    └─ manage.log
├─ mvnw
├─ mvnw.cmd
├─ out
│    └─ artifacts
│           └─ students_jar
│                  ├─ HikariCP-3.2.0.jar
│                  ├─ classmate-1.4.0.jar
│                  ├─ filters-2.0.235-1.jar
│                  ├─ hibernate-validator-6.0.14.Final.jar
│                  ├─ jackson-annotations-2.9.0.jar
│                  ├─ jackson-core-2.9.8.jar
│                  ├─ jackson-databind-2.9.8.jar
│                  ├─ jackson-datatype-jdk8-2.9.8.jar
│                  ├─ jackson-datatype-jsr310-2.9.8.jar
│                  ├─ jackson-module-parameter-names-2.9.8.jar
│                  ├─ javax.annotation-api-1.3.2.jar
│                  ├─ javax.servlet-api-4.0.1.jar
│                  ├─ jboss-logging-3.3.2.Final.jar
│                  ├─ jul-to-slf4j-1.7.25.jar
│                  ├─ kaptcha-2.3.2.jar
│                  ├─ log4j-api-2.11.2.jar
│                  ├─ log4j-to-slf4j-2.11.2.jar
│                  ├─ logback-classic-1.2.3.jar
│                  ├─ logback-core-1.2.3.jar
│                  ├─ mybatis-3.5.0.jar
│                  ├─ mybatis-spring-2.0.0.jar
│                  ├─ mybatis-spring-boot-autoconfigure-2.0.0.jar
│                  ├─ mybatis-spring-boot-starter-2.0.0.jar
│                  ├─ mybatisplus-spring-boot-starter-1.0.5.jar
│                  ├─ mysql-connector-java-8.0.15.jar
│                  ├─ slf4j-api-1.7.25.jar
│                  ├─ snakeyaml-1.23.jar
│                  ├─ spring-aop-5.1.5.RELEASE.jar
│                  ├─ spring-beans-5.1.5.RELEASE.jar
│                  ├─ spring-boot-2.1.3.RELEASE.jar
│                  ├─ spring-boot-autoconfigure-2.1.3.RELEASE.jar
│                  ├─ spring-boot-configuration-processor-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-jdbc-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-json-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-logging-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-tomcat-2.1.3.RELEASE.jar
│                  ├─ spring-boot-starter-web-2.1.3.RELEASE.jar
│                  ├─ spring-context-5.1.5.RELEASE.jar
│                  ├─ spring-core-5.1.5.RELEASE.jar
│                  ├─ spring-expression-5.1.5.RELEASE.jar
│                  ├─ spring-jcl-5.1.5.RELEASE.jar
│                  ├─ spring-jdbc-5.1.5.RELEASE.jar
│                  ├─ spring-tx-5.1.5.RELEASE.jar
│                  ├─ spring-web-5.1.5.RELEASE.jar
│                  ├─ spring-webmvc-5.1.5.RELEASE.jar
│                  ├─ students.jar
│                  ├─ tomcat-embed-core-9.0.16.jar
│                  ├─ tomcat-embed-el-9.0.16.jar
│                  ├─ tomcat-embed-websocket-9.0.16.jar
│                  └─ validation-api-2.0.1.Final.jar
├─ pom.xml
├─ src
│    ├─ main
│    │    ├─ java
│    │    │    └─ com
│    │    │           └─ example
│    │    │                  └─ demo
│    │    │                         ├─ DemoApplication.java
│    │    │                         ├─ controller
│    │    │                         │    ├─ CourseController.java
│    │    │                         │    ├─ StudentController.java
│    │    │                         │    ├─ TeacherController.java
│    │    │                         │    └─ UserController.java
│    │    │                         ├─ entity
│    │    │                         │    ├─ ChooseCourse.java
│    │    │                         │    ├─ Course.java
│    │    │                         │    ├─ Student.java
│    │    │                         │    ├─ Teacher.java
│    │    │                         │    ├─ TeacherSeeCourseList.java
│    │    │                         │    ├─ User.java
│    │    │                         │    └─ adminSeeStudentChooseCourseMsg.java
│    │    │                         ├─ mapper
│    │    │                         │    ├─ CourseMapper.java
│    │    │                         │    ├─ StudentMapper.java
│    │    │                         │    ├─ TeacherMapper.java
│    │    │                         │    └─ UserMapper.java
│    │    │                         ├─ service
│    │    │                         │    ├─ CourseService.java
│    │    │                         │    ├─ CourseServiceImpl.java
│    │    │                         │    ├─ StudentService.java
│    │    │                         │    ├─ StudentServiceImpl.java
│    │    │                         │    ├─ TeacherService.java
│    │    │                         │    ├─ TeacherServiceImpl.java
│    │    │                         │    ├─ UserService.java
│    │    │                         │    └─ UserServiceImpl.java
│    │    │                         └─ utils
│    │    │                                ├─ Response.java
│    │    │                                └─ Verify.java
│    │    └─ resources
│    │           ├─ a.xml
│    │           ├─ application.yml
│    │           ├─ logback-spring.xml
│    │           ├─ mapper
│    │           │    ├─ CourseMapper.xml
│    │           │    ├─ StudentMapper.xml
│    │           │    ├─ TeacherMapper.xml
│    │           │    └─ UserMapper.xml
│    │           └─ static
│    │                  ├─ admin
│    │                  │    ├─ adminCenter.html
│    │                  │    ├─ adminSeeStudentChooseCourseMsg.html
│    │                  │    ├─ adminUserCenter.html
│    │                  │    ├─ courseMsgCenter.html
│    │                  │    ├─ showAllStudentsMsg.html
│    │                  │    └─ showAllTeachersMsg.html
│    │                  ├─ css
│    │                  │    └─ head.css
│    │                  ├─ img
│    │                  │    └─ timg.jpg
│    │                  ├─ js
│    │                  │    └─ jquery2.0.js
│    │                  ├─ student
│    │                  │    ├─ chooseClass.html
│    │                  │    ├─ forgetPassword.html
│    │                  │    ├─ login.html
│    │                  │    ├─ register.html
│    │                  │    ├─ studentMsgAdd.html
│    │                  │    ├─ studentPersonalMsgCenter.html
│    │                  │    ├─ userIndex.html
│    │                  │    └─ userPersonalCenter.html
│    │                  └─ teacher
│    │                         ├─ showCourseMsg.html
│    │                         ├─ showStudentList.html
│    │                         ├─ teacherAddCourse.html
│    │                         ├─ teacherCenter.html
│    │                         ├─ teacherMsgCenter.html
│    │                         ├─ teacherPersonalCenter.html
│    │                         └─ teacherPersonalMsgCenter.html
│    └─ test
│           └─ java
│                  └─ com
│                         └─ example
│                                └─ demo
│                                       └─ DemoApplicationTests.java
├─ students.iml
└─ target
       ├─ classes
       │    ├─ a.xml
       │    ├─ application.yml
       │    ├─ com
       │    │    └─ example
       │    │           └─ demo
       │    │                  ├─ DemoApplication.class
       │    │                  ├─ controller
       │    │                  │    ├─ CourseController.class
       │    │                  │    ├─ StudentController.class
       │    │                  │    ├─ TeacherController.class
       │    │                  │    └─ UserController.class
       │    │                  ├─ entity
       │    │                  │    ├─ ChooseCourse.class
       │    │                  │    ├─ Course.class
       │    │                  │    ├─ Student.class
       │    │                  │    ├─ Teacher.class
       │    │                  │    ├─ TeacherSeeCourseList.class
       │    │                  │    ├─ User.class
       │    │                  │    └─ adminSeeStudentChooseCourseMsg.class
       │    │                  ├─ mapper
       │    │                  │    ├─ CourseMapper.class
       │    │                  │    ├─ StudentMapper.class
       │    │                  │    ├─ TeacherMapper.class
       │    │                  │    └─ UserMapper.class
       │    │                  ├─ service
       │    │                  │    ├─ CourseService.class
       │    │                  │    ├─ CourseServiceImpl.class
       │    │                  │    ├─ StudentService.class
       │    │                  │    ├─ StudentServiceImpl.class
       │    │                  │    ├─ TeacherService.class
       │    │                  │    ├─ TeacherServiceImpl.class
       │    │                  │    ├─ UserService.class
       │    │                  │    └─ UserServiceImpl.class
       │    │                  └─ utils
       │    │                         ├─ Response.class
       │    │                         └─ Verify.class
       │    ├─ logback-spring.xml
       │    ├─ mapper
       │    │    ├─ CourseMapper.xml
       │    │    ├─ StudentMapper.xml
       │    │    ├─ TeacherMapper.xml
       │    │    └─ UserMapper.xml
       │    └─ static
       │           ├─ admin
       │           │    ├─ adminCenter.html
       │           │    ├─ adminSeeStudentChooseCourseMsg.html
       │           │    ├─ adminUserCenter.html
       │           │    ├─ courseMsgCenter.html
       │           │    ├─ showAllStudentsMsg.html
       │           │    └─ showAllTeachersMsg.html
       │           ├─ css
       │           │    └─ head.css
       │           ├─ img
       │           │    └─ timg.jpg
       │           ├─ js
       │           │    └─ jquery2.0.js
       │           ├─ student
       │           │    ├─ chooseClass.html
       │           │    ├─ forgetPassword.html
       │           │    ├─ login.html
       │           │    ├─ register.html
       │           │    ├─ studentMsgAdd.html
       │           │    ├─ studentPersonalMsgCenter.html
       │           │    ├─ userIndex.html
       │           │    └─ userPersonalCenter.html
       │           └─ teacher
       │                  ├─ showCourseMsg.html
       │                  ├─ showStudentList.html
       │                  ├─ teacherAddCourse.html
       │                  ├─ teacherCenter.html
       │                  ├─ teacherMsgCenter.html
       │                  ├─ teacherPersonalCenter.html
       │                  └─ teacherPersonalMsgCenter.html
       ├─ demo-0.0.1-SNAPSHOT
       │    └─ WEB-INF
       │           ├─ classes
       │           │    ├─ a.xml
       │           │    ├─ application.yml
       │           │    ├─ com
       │           │    │    └─ example
       │           │    │           └─ demo
       │           │    │                  ├─ DemoApplication.class
       │           │    │                  ├─ controller
       │           │    │                  ├─ entity
       │           │    │                  ├─ mapper
       │           │    │                  ├─ service
       │           │    │                  └─ utils
       │           │    ├─ logback-spring.xml
       │           │    ├─ mapper
       │           │    │    ├─ CourseMapper.xml
       │           │    │    ├─ StudentMapper.xml
       │           │    │    ├─ TeacherMapper.xml
       │           │    │    └─ UserMapper.xml
       │           │    └─ static
       │           │           ├─ admin
       │           │           │    ├─ adminCenter.html
       │           │           │    ├─ adminSeeStudentChooseCourseMsg.html
       │           │           │    ├─ adminUserCenter.html
       │           │           │    ├─ courseMsgCenter.html
       │           │           │    ├─ showAllStudentsMsg.html
       │           │           │    └─ showAllTeachersMsg.html
       │           │           ├─ css
       │           │           │    └─ head.css
       │           │           ├─ img
       │           │           │    └─ timg.jpg
       │           │           ├─ js
       │           │           │    └─ jquery2.0.js
       │           │           ├─ student
       │           │           │    ├─ chooseClass.html
       │           │           │    ├─ forgetPassword.html
       │           │           │    ├─ login.html
       │           │           │    ├─ register.html
       │           │           │    ├─ studentMsgAdd.html
       │           │           │    ├─ studentPersonalMsgCenter.html
       │           │           │    ├─ userIndex.html
       │           │           │    └─ userPersonalCenter.html
       │           │           └─ teacher
       │           │                  ├─ showCourseMsg.html
       │           │                  ├─ showStudentList.html
       │           │                  ├─ teacherAddCourse.html
       │           │                  ├─ teacherCenter.html
       │           │                  ├─ teacherMsgCenter.html
       │           │                  ├─ teacherPersonalCenter.html
       │           │                  └─ teacherPersonalMsgCenter.html
       │           └─ lib
       │                  ├─ HikariCP-3.2.0.jar
       │                  ├─ classmate-1.4.0.jar
       │                  ├─ filters-2.0.235-1.jar
       │                  ├─ hibernate-validator-6.0.14.Final.jar
       │                  ├─ jackson-annotations-2.9.0.jar
       │                  ├─ jackson-core-2.9.8.jar
       │                  ├─ jackson-databind-2.9.8.jar
       │                  ├─ jackson-datatype-jdk8-2.9.8.jar
       │                  ├─ jackson-datatype-jsr310-2.9.8.jar
       │                  ├─ jackson-module-parameter-names-2.9.8.jar
       │                  ├─ javax.annotation-api-1.3.2.jar
       │                  ├─ javax.servlet-api-4.0.1.jar
       │                  ├─ jboss-logging-3.3.2.Final.jar
       │                  ├─ jul-to-slf4j-1.7.25.jar
       │                  ├─ kaptcha-2.3.2.jar
       │                  ├─ log4j-api-2.11.2.jar
       │                  ├─ log4j-to-slf4j-2.11.2.jar
       │                  ├─ logback-classic-1.2.3.jar
       │                  ├─ logback-core-1.2.3.jar
       │                  ├─ mybatis-3.5.0.jar
       │                  ├─ mybatis-spring-2.0.0.jar
       │                  ├─ mybatis-spring-boot-autoconfigure-2.0.0.jar
       │                  ├─ mybatis-spring-boot-starter-2.0.0.jar
       │                  ├─ mybatisplus-spring-boot-starter-1.0.5.jar
       │                  ├─ mysql-connector-java-8.0.15.jar
       │                  ├─ slf4j-api-1.7.25.jar
       │                  ├─ snakeyaml-1.23.jar
       │                  ├─ spring-aop-5.1.5.RELEASE.jar
       │                  ├─ spring-beans-5.1.5.RELEASE.jar
       │                  ├─ spring-boot-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-autoconfigure-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-configuration-processor-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-jdbc-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-json-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-logging-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-tomcat-2.1.3.RELEASE.jar
       │                  ├─ spring-boot-starter-web-2.1.3.RELEASE.jar
       │                  ├─ spring-context-5.1.5.RELEASE.jar
       │                  ├─ spring-core-5.1.5.RELEASE.jar
       │                  ├─ spring-expression-5.1.5.RELEASE.jar
       │                  ├─ spring-jcl-5.1.5.RELEASE.jar
       │                  ├─ spring-jdbc-5.1.5.RELEASE.jar
       │                  ├─ spring-tx-5.1.5.RELEASE.jar
       │                  ├─ spring-web-5.1.5.RELEASE.jar
       │                  ├─ spring-webmvc-5.1.5.RELEASE.jar
       │                  ├─ tomcat-embed-core-9.0.16.jar
       │                  ├─ tomcat-embed-el-9.0.16.jar
       │                  ├─ tomcat-embed-websocket-9.0.16.jar
       │                  └─ validation-api-2.0.1.Final.jar
       ├─ demo-0.0.1-SNAPSHOT.war
       ├─ demo-0.0.1-SNAPSHOT.war.original
       ├─ maven-archiver
       │    └─ pom.properties
       ├─ maven-status
       │    └─ maven-compiler-plugin
       │           ├─ compile
       │           │    └─ default-compile
       │           │           ├─ createdFiles.lst
       │           │           └─ inputFiles.lst
       │           └─ testCompile
       │                  └─ default-testCompile
       │                         ├─ createdFiles.lst
       │                         └─ inputFiles.lst
       ├─ surefire-reports
       │    ├─ TEST-com.example.demo.DemoApplicationTests.xml
       │    └─ com.example.demo.DemoApplicationTests.txt
       └─ test-classes
              └─ com
                     └─ example
                            └─ demo
                                   └─ DemoApplicationTests.class
