SUMMARY = "Jakarta WebSocket"
DESCRIPTION = "Jakarta WebSocket defines a set of Java APIs for the development of WebSocket \
applications."
LICENSE = "EPL-2.0 | GPL-2.0-with-Classpath-Exception"

PV = "2.2.0"

RPM_NAME = "jakarta-websocket-2.2.0-3.4.noarch.rpm"
RPM_HASH = "dc022ebd1aaa948551138eac5b276b4f6916f6c6e4cb4150b51a554782a5a96b3cab1520108474c6f3ddd18eaf58514927a47cd4112715076b8ef035bf37b905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-websocket \
mvn-jakarta.websocket-jakarta.websocket-api \
mvn-jakarta.websocket-jakarta.websocket-api-pom- \
mvn-jakarta.websocket-jakarta.websocket-client-api \
mvn-jakarta.websocket-jakarta.websocket-client-api-pom- \
osgi-jakarta.websocket-api \
osgi-jakarta.websocket-client-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
