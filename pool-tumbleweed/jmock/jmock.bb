SUMMARY = "Test Java code using mock objects"
DESCRIPTION = "jMock is a library for testing Java code using mock objects. Mock \
   objects help you design and test the interactions between the \
   objects in your programs. The jMock package: * makes it quick and \
   easy to define mock objects, so you don't break the rhythm of \
   programming. \
 \
* lets you define flexible constraints over object interactions, \
   reducing the brittleness of your tests. \
 \
* is easy to extend."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jmock-1.2.0-31.9.noarch.rpm"
RPM_HASH = "12068f9adb7f24e9ab97942948afd9cfd7513f72ae28691c559b7e363f206edc9d224dedbaeb1f204737f700271e0d0dfeab1a44eada7781b1ed3b057655542e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock \
mvn-jmock-jmock \
mvn-jmock-jmock-cglib \
mvn-jmock-jmock-cglib-pom- \
mvn-jmock-jmock-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-cglib-cglib-nodep \
mvn-junit-junit"

inherit rpm
