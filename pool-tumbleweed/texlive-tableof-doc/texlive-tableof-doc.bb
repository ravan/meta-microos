SUMMARY = "Documentation for texlive-tableof"
DESCRIPTION = "This package includes the documentation for texlive-tableof"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4dsvn77682"

RPM_NAME = "texlive-tableof-doc-2026.226.1.4dsvn77682-64.2.noarch.rpm"
RPM_HASH = "30cab173b8bb11d0ad9861426e12f11e516d24460306cb1391c00428efec28b6ed086e309d2698c0f18383d0caac17c063889b6cdc8cbf973a652075497c5530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tableof-doc"

RDEPENDS:${PN} += ""

inherit rpm
