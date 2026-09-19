SUMMARY = "Plexus Testing"
DESCRIPTION = "Library to help testing plexus components"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "plexus-testing-2.1.0-2.3.noarch.rpm"
RPM_HASH = "5cb03137dc36bdce2f0747dd48b3f029208bcaf9f9d8890b30269e1ba9ea1a5d06e11de7b5d28ded20dd45adae3d6f4bc5cbf7376ecbb864c77fa37083c98adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-testing \
mvn-org.codehaus.plexus-plexus-testing-pom- \
plexus-testing"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-com.google.inject-guice--classes- \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.junit.jupiter-junit-jupiter-api"

inherit rpm
