SUMMARY = "The libpamtest API documentation"
DESCRIPTION = "Documentation for libpamtest development."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "libpamtest-devel-doc-1.1.8-1.4.noarch.rpm"
RPM_HASH = "5f99ffd90e041b8886a12648cfa037104dd3064c7353336d170f6ccae370efedb5642b69d35f266ab6e41eaedf0ccf78e55cff4582212f4af2340421e050a488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpamtest-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
