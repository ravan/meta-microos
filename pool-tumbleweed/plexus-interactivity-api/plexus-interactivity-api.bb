SUMMARY = "API for plexus-interactivity"
DESCRIPTION = "API module for plexus-interactivity."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "plexus-interactivity-api-1.5.1-2.2.noarch.rpm"
RPM_HASH = "6603fa5cbc79be2a3abd136f4a551d47b49bb279561584855b5b62ed083fa93ed480ee471c8a1dae846f3887197d5ff2231c8b53a9a464a57731da7a2b4dc5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-interactivity-api-pom- \
plexus-interactivity-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
