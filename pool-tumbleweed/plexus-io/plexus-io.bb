SUMMARY = "Plexus IO Components"
DESCRIPTION = "Plexus IO is a set of plexus components, which are designed for use \
in I/O operations."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "plexus-io-3.6.0-1.3.noarch.rpm"
RPM_HASH = "ea2c75e1d1523c0d988ef498d270f209b453946a09191cf4dc003fc670e1d251c11da097c61ac98039327b6c8063ff16bd62ac0be0b86e746fc7d5e900c4c58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-io-pom- \
plexus-io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
