SUMMARY = "Mojo Executor"
DESCRIPTION = "The Mojo Executor provides a way to to execute other Mojos (plugins) within a Maven plugin, \
allowing to create Maven plugins that are composed of other plugins."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-2.4.0-3.8.noarch.rpm"
RPM_HASH = "c797bf8c160986b3a058b475e47c94444c741a11d463daa4cb1e2012024b1f3b99f26726ee35155835baa1665e258477af2cc431e53b517dc349aae21e37d1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor \
mvn-org.twdata.maven-mojo-executor \
mvn-org.twdata.maven-mojo-executor-parent-pom- \
mvn-org.twdata.maven-mojo-executor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
