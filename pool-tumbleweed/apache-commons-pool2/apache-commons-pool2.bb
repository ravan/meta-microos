SUMMARY = "Apache Commons Pool 2.x series"
DESCRIPTION = "The goal of the Pool 2.x package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "2.13.1"

RPM_NAME = "apache-commons-pool2-2.13.1-1.3.noarch.rpm"
RPM_HASH = "359cca4d9a022c44848b2ca66e05aecbb9cdf8360cc3d7c8ad993f49346fc9632e88330f0fc4670bb2b1d1b58ff1a714e117cb758a542f524db60a0dde323cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2 \
commons-pool2 \
mvn-org.apache.commons-commons-pool2 \
mvn-org.apache.commons-commons-pool2-pom- \
osgi-org.apache.commons.commons-pool2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
