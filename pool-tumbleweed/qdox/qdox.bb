SUMMARY = "Tool to extract class/interface/method definitions from sources"
DESCRIPTION = "QDox is a parser for extracting class/interface/method definitions \
from source files complete with JavaDoc @tags. It is designed to be \
used by active code generators or documentation tools."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "qdox-2.1.0-1.8.noarch.rpm"
RPM_HASH = "5488056ab65e141678146b80b42e9969d5b9205804ac3e0477f12ecd5b5518d0468da75aa0ac5d286347300ef5065a4a56efca372ae3e3c52d902da698378067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.qdox-qdox \
mvn-com.thoughtworks.qdox-qdox-pom- \
mvn-qdox-qdox \
mvn-qdox-qdox-pom- \
osgi-com.thoughtworks.qdox \
qdox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
