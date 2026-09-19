SUMMARY = "Documentation for Claw library"
DESCRIPTION = "This subpackage contains the documentation and examples for using \
libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "libclaw-doc-1.9.1-1.9.noarch.rpm"
RPM_HASH = "15a4afee64e0867e17d2ab419e028b032b72ff648dcdc44489a0c77ab0593629e75f203698c0ff7cc56399056b287a63a82af2cfe84825412ebd21e6460faf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclaw-doc"

RDEPENDS:${PN} += ""

inherit rpm
