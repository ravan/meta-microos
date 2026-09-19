SUMMARY = "Documentation of librevenge API"
DESCRIPTION = "The librevenge-doc package contains documentation files for librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-doc-0.0.5-1.14.noarch.rpm"
RPM_HASH = "3e776f0751d01f7e80206490d142cd1e0d2756e52b6c5fe61f4a1540dd14598490748ce6f21c78f8e0de5139d425f1f201ad0020c19cc9262b20e85485de7176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librevenge-doc"

RDEPENDS:${PN} += ""

inherit rpm
