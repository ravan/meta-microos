SUMMARY = "API Guardian Java annotation"
DESCRIPTION = "API Guardian indicates the status of an API element and therefore its \
level of stability as well.  It is used to annotate public types, \
methods, constructors, and fields within a framework or application in \
order to publish their API status and level of stability and to \
indicate how they are intended to be used by consumers of the API."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "apiguardian-1.1.2-2.10.noarch.rpm"
RPM_HASH = "9d37452fe82465756542f0df500530cab7a6d16b21fb2acca0b1ed23e34215475f0d2f799c5e193535544e203adcd86191a04c48ea38ac20d1f33684f163859c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian \
mvn-org.apiguardian-apiguardian-api \
mvn-org.apiguardian-apiguardian-api-pom- \
osgi-org.apiguardian"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
