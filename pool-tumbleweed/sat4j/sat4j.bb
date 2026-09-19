SUMMARY = "A library of SAT solvers written in Java"
DESCRIPTION = "The aim of the SAT4J library is to provide an efficient library of SAT \
solvers in Java. The SAT4J library targets first users of SAT 'black \
boxes', those willing to embed SAT technologies into their application \
without worrying about the details."
LICENSE = "EPL-1.0 & LGPL-2.0-only"

PV = "2.3.5"

RPM_NAME = "sat4j-2.3.5-4.9.noarch.rpm"
RPM_HASH = "ba626fbb765f3078a6e33bed0e8b0437e7a7bc525c1c82eff53890cabe9dd767c98ca37386bd56002a51af32208bed352eae56f613ae89d0a59f37304c071c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ow2.sat4j-org.ow2.sat4j.core \
mvn-org.ow2.sat4j-org.ow2.sat4j.core-pom- \
mvn-org.ow2.sat4j-org.ow2.sat4j.pb \
mvn-org.ow2.sat4j-org.ow2.sat4j.pb-pom- \
osgi-org.sat4j.core \
osgi-org.sat4j.pb \
sat4j"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
