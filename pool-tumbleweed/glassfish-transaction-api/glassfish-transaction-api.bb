SUMMARY = "Java JTA 1.3 API Design Specification"
DESCRIPTION = "Project GlassFish Java Transaction API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-1.3-7.3.noarch.rpm"
RPM_HASH = "df872beda325362bbf4a06be470c17d9d43d0443ed989b0f097d320e5f721dc64cb658e041c15669ddb602397c989d4fd3450232a1f60295dd20c83f314afcd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api \
mvn-javax.transaction-javax.transaction-api \
mvn-javax.transaction-javax.transaction-api-pom- \
mvn-javax.transaction-transaction-api \
mvn-javax.transaction-transaction-api-pom- \
osgi-${project.artifacId}"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
