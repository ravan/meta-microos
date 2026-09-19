SUMMARY = "SQL Mapping Framework for Java"
DESCRIPTION = "The MyBatis data mapper framework makes it easier \
to use a relational database with object-oriented \
applications. MyBatis couples objects with stored \
procedures or SQL statements using a XML descriptor \
or annotations. Simplicity is the biggest advantage \
of the MyBatis data mapper over object relational \
mapping tools. \
 \
To use the MyBatis data mapper, you rely on your \
own objects, XML, and SQL. There is little to \
learn that you don't already know. With the \
MyBatis data mapper, you have the full power of \
both SQL and stored procedures at your fingertips. \
 \
The MyBatis project is developed and maintained by \
a team that includes the original creators of the \
'iBATIS' data mapper. The Apache project was retired \
and continued here."
LICENSE = "Apache-2.0"

PV = "3.5.19"

RPM_NAME = "mybatis-3.5.19-2.5.noarch.rpm"
RPM_HASH = "d737b0e223546b8b7f44f65310b716e9639f3c820fb8aca1a01217d7816d53d1db8b2f6a7f9d2b1945880f7b9a32680d6ef7bcfacdff78a4ff78f43b2b168d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-mybatis \
mvn-org.mybatis-mybatis \
mvn-org.mybatis-mybatis-pom- \
mybatis \
osgi-org.mybatis.mybatis"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ognl-ognl"

inherit rpm
