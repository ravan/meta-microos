SUMMARY = "Java-based codings helper classes for Joni and JRuby"
DESCRIPTION = "jcodings: java-based codings helper classes for Joni and JRuby."
LICENSE = "MIT"

PV = "1.0.58"

RPM_NAME = "jcodings-1.0.58-1.5.noarch.rpm"
RPM_HASH = "f2926187fd079ee05e6c5578967eae0b80ed3dcab98358fc8d00f21de26aecf11b55231484d893193480aa5af84f9dfcd707ce5418ae7892243e2cd2526bdf9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcodings \
mvn-org.jruby.jcodings-jcodings \
mvn-org.jruby.jcodings-jcodings-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
