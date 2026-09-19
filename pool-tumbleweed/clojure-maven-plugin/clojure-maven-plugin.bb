SUMMARY = "Maven plugin for compiling Clojure source files"
DESCRIPTION = "clojure-maven-plugin is a Maven plugin that allows compiling Clojure source \
files, running Clojure REPLs, and executing Clojure scripts within a Maven \
project lifecycle."
LICENSE = "EPL-1.0"

PV = "1.9.3"

RPM_NAME = "clojure-maven-plugin-1.9.3-1.1.noarch.rpm"
RPM_HASH = "e2e95deae73dbc9c24f7af86a6c4682695313202e1c95c207e87ec57b06d964d70ae5d98daba4d2d512714464b579340971a2a45b07d7c43aa0aa5ba038efa79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-maven-plugin \
mvn-com.theoryinpractise-clojure-maven-plugin \
mvn-com.theoryinpractise-clojure-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
