SUMMARY = "Documentation for the libmspub API"
DESCRIPTION = "This package contains documentation for the libmspub API."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "libmspub-devel-doc-0.1.5-2.3.noarch.rpm"
RPM_HASH = "4c2a69770e88daa0f283a5ac2a7c5482b6a7b5c00ecd28e979eb1fc9e9019167fc0c7f1fde4a809d3ebfcf3acc596f056b8299c4d20de6f47d4d8fb437be8ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmspub-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
