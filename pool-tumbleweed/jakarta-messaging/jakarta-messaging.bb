SUMMARY = "JMS / Jakarta Messaging API"
DESCRIPTION = "This package contains the API definition source code for the Jakarta \
Messaging API."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.1.0"

RPM_NAME = "jakarta-messaging-3.1.0-2.3.noarch.rpm"
RPM_HASH = "25b75bca9666d86c5cfbbbff3b5f45a3817144371c27c6231eb5c3668e5c743e12bbe089c2bcfe09b15fb77c2a478eb970a26b3b87e6c851343cf90761f77121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-messaging \
mvn-jakarta.jms-jakarta.jms-api \
mvn-jakarta.jms-jakarta.jms-api-pom- \
osgi-jakarta.jms-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
