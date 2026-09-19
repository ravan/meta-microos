SUMMARY = "Libraqm documentation"
DESCRIPTION = "This package contains documentation files for raqm."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "libraqm-doc-0.11.0-1.1.noarch.rpm"
RPM_HASH = "3c4aa940b018c51390dcd9a1179a2972804f31426cfc58a7f994e968be94e5dc98a02af448ed11c28561da30d42869f76deecc85809a1041f35228e7b498447c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libraqm-doc"

RDEPENDS:${PN} += ""

inherit rpm
