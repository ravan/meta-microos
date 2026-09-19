SUMMARY = "The Apache Commons Mathematics Library"
DESCRIPTION = "Commons Math is a library of lightweight, self-contained mathematics and \
statistics components addressing the most common problems not available in \
the Java programming language or Commons Lang."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-3.6.1-9.7.noarch.rpm"
RPM_HASH = "b955248a302d5fde71252b12433a8a9da809873f3b9dbb8bb18684d4512e4590f9698edb691bc0b3dd5e787219e74fd8a2513affb43443404f7c37ed7d9c4d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math \
apache-commons-math3 \
mvn-org.apache.commons-commons-math3 \
mvn-org.apache.commons-commons-math3-pom- \
osgi-org.apache.commons.math3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
