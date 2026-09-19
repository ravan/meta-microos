SUMMARY = "Plexus Interpolation API"
DESCRIPTION = "Plexus interpolator is the outgrowth of multiple iterations of development \
focused on providing a more modular, flexible interpolation framework for \
the expression language style commonly seen in Maven, Plexus, and other \
related projects."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.28"

RPM_NAME = "plexus-interpolation-1.28-1.6.noarch.rpm"
RPM_HASH = "97146b9cee106e2072c413796689ae89e7eaf874c17576d1333d7a4aaaf7dfe5a9a42bfc435d819b085e165ff5e715675aae83858fd02798e527ff0109d78c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-interpolation-pom- \
plexus-interpolation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
