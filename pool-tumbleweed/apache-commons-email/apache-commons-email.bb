SUMMARY = "Apache Commons Email Package"
DESCRIPTION = "Commons-Email aims to provide an API for sending email. It is built on top of \
the JavaMail API, which it aims to simplify."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-email-1.6.0-1.3.noarch.rpm"
RPM_HASH = "ef5ed42873fd76dac14d81b6238778a6c4cf0d0949900dbef08ba4eb8d07edbbae2ea8b34b7b3ba4fd6bcfa93a245b2d329082bd9cc0553edb68fe4ac6227ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email \
mvn-org.apache.commons-commons-email \
mvn-org.apache.commons-commons-email-pom- \
osgi-org.apache.commons.commons-email"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.mail-jakarta.mail"

inherit rpm
