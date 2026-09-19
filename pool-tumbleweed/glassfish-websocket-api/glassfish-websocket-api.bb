SUMMARY = "JSR 356: Java API for WebSocket"
DESCRIPTION = "Java API for WebSocket JSR will define a standard API for \
creating web socket applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-1.1-4.4.noarch.rpm"
RPM_HASH = "36143bea8be71280ca34316f47859c46660d7d79ce044fb22ecec0d406a0d6e2cdd3a7d8ac32e164f47f15201116d30e23b5d0049f5354d07d68a392fefb3184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api \
mvn-javax.websocket-javax.websocket-all-pom- \
mvn-javax.websocket-javax.websocket-api \
mvn-javax.websocket-javax.websocket-api-pom- \
mvn-javax.websocket-javax.websocket-client-api \
mvn-javax.websocket-javax.websocket-client-api-pom- \
osgi-jakarta.websocket-api \
osgi-javax.websocket.javax.websocket-client-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
