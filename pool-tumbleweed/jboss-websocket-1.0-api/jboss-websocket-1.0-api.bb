SUMMARY = "JSR-356: Java WebSocket 1.0 API"
DESCRIPTION = "The JSR-356: Java WebSocket 1.0 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-1.0.0-4.10.noarch.rpm"
RPM_HASH = "1a73edcad0b828da1c2ba2d1dc7c5f6d6eeb41d14b24fdc13c5af5fe270c24eb6cba4c4f2a3849258affe046191e6131b2e7032f8b687a761125ce927ca85506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api \
mvn-javax.websocket-javax.websocket-api \
mvn-javax.websocket-javax.websocket-api-pom- \
mvn-javax.websocket-javax.websocket-client-api \
mvn-javax.websocket-javax.websocket-client-api-pom- \
mvn-org.jboss.spec.javax.websocket-jboss-websocket-api-1.0-spec \
mvn-org.jboss.spec.javax.websocket-jboss-websocket-api-1.0-spec-pom- \
osgi-org.jboss.spec.javax.websocket.jboss-websocket-api-1.0-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
