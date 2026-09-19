SUMMARY = "Hierarchical repository abstraction layer"
DESCRIPTION = "LibRepository provides a simple abstraction layer to access bulk content that \
is organized in a hierarchical layer."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-1.1.6-2.9.noarch.rpm"
RPM_HASH = "cd3413c2805b49eeaf307921b1f8088f9d1fb35126690c4be28d7dbe8bd4d5b17e2646ba5024fe040ab52883ad510f72eefc9996a89be18e8def60b4b45330ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
