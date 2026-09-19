SUMMARY = "Java logging toolkit"
DESCRIPTION = "LogKit is a logging toolkit designed for secure performance oriented \
logging in applications. To get started using LogKit, it is recomended \
that you read the whitepaper and browse the API docs."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-2.1-27.9.noarch.rpm"
RPM_HASH = "3c6ef61f37c4d06e5c6fed5209da2c31906c05a29c9c4ff1b184961c0ba60e9ae447560efb4551a470b6c12c900fdcdbcf123d4854ea2ac9c582e754d33c164b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit \
mvn-avalon-logkit-avalon-logkit \
mvn-avalon-logkit-avalon-logkit-pom- \
mvn-logkit-logkit \
mvn-logkit-logkit-pom- \
mvn-org.apache.avalon.logkit-avalon-logkit \
mvn-org.apache.avalon.logkit-avalon-logkit-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.jms-jms \
mvn-javax.mail-mail \
mvn-javax.servlet-servlet-api \
mvn-log4j-log4j"

inherit rpm
