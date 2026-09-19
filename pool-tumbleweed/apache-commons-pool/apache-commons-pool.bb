SUMMARY = "Apache Commons Pool"
DESCRIPTION = "The goal of the Pool package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-1.6-8.10.noarch.rpm"
RPM_HASH = "41d3282f8370eee586a2c4054d7d3d6cd53abbefc5f72e92834c96946c4a48e369eb39a7806776b59169eab6fb9c759d4ff1541e9645b31f71d31f6b7f12c523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool \
commons-pool \
jakarta-commons-pool \
mvn-commons-pool-commons-pool \
mvn-commons-pool-commons-pool-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
