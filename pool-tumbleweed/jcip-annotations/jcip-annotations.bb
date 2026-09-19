SUMMARY = "A clean room implementation of the JCIP Annotations"
DESCRIPTION = "A clean room implementation of the JCIP Annotations based entirely on the \
specification provided by the javadocs."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "jcip-annotations-1.0.1-2.7.noarch.rpm"
RPM_HASH = "78fc2c78aa2239e8e0dfee22fdca3dd4c60b56c97face4af2dff3ed58effeb57a4b9eee87872fedd36e1bd270376a2ca0a9536ca2f01d00e9dbe8d84b4988c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations \
mvn-com.github.stephenc.jcip-jcip-annotations \
mvn-com.github.stephenc.jcip-jcip-annotations-pom- \
mvn-net.jcip-jcip-annotations \
mvn-net.jcip-jcip-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
