SUMMARY = "Parent POM for projects contributed to Clojure"
DESCRIPTION = "This package defines a common Maven Project Object Model (POM) baseline for \
libraries contributed to Clojure."
LICENSE = "EPL-1.0"

PV = "1.4.3"

RPM_NAME = "clojure-build-poms-1.4.3-1.1.noarch.rpm"
RPM_HASH = "c50b81c56c71a00d3394685d6c9550994a11f008362d182b0eb9697a0523da6985c3690ce5cf156868ee0120e981988b275ccbc00330e3fad66c82725682445a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-build-poms \
mvn-org.clojure-pom.contrib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.theoryinpractise-clojure-maven-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.clojure-clojure \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
