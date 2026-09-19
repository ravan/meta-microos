SUMMARY = "Public interfaces useful for applications to support RELAX Core"
DESCRIPTION = "The ISO RELAX project is started to host the public interfaces useful \
for applications to support RELAX Core. But nowadays some of the stuff \
we have is schema language neutral."
LICENSE = "Apache-2.0 & MIT"

PV = "0.1"

RPM_NAME = "isorelax-0.1-31.9.noarch.rpm"
RPM_HASH = "123323674da61d7bf1ed44cf70b7daf250a57bce9838640f8c78ec3bf6235158f38623be1087f6c655f9f2e78aa59ba4e2f9dceff626ed87d444a510ce98794f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "isorelax \
isorelax-bootstrap \
mvn-isorelax-isorelax \
mvn-isorelax-isorelax-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xerces-j2 \
xml-apis"

inherit rpm
