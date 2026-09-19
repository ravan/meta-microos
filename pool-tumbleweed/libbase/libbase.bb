SUMMARY = "JFree Base Services"
DESCRIPTION = "LibBase is a library developed to provide base services like logging, \
configuration and initialization to other libraries and applications. The \
library is the root library for all Pentaho-Reporting projects."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-1.1.6-2.9.noarch.rpm"
RPM_HASH = "bda5ff71437e2d75e5dba5b378ab068bfd789987dda7fe8ef555d0301f7f68d948fa9906ab824c0c94a4098b03b90d2573da0c63629edec416303a9c0e96d363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase"

RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils"

inherit rpm
