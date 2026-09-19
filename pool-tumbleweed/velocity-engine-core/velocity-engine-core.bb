SUMMARY = "Apache Velocity - Engine"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "velocity-engine-core-2.4.1-1.6.noarch.rpm"
RPM_HASH = "da25ac840a6a9230daa2b8fa7d7c289f1372cdfee7a8176ba0d5d8242d48fb6459636fa6dfb7b63b9ee3589722dc59b6b712bcd12426185d7a6ee5bb469ee9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity-velocity-engine-core-pom- \
osgi-org.apache.velocity.engine-core \
velocity-engine-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.slf4j-slf4j-api"

inherit rpm
