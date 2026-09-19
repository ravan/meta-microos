SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only"

PV = "1.28.1"

RPM_NAME = "mate-power-manager-doc-1.28.1-3.6.noarch.rpm"
RPM_HASH = "2774ec5d9b640813acd8eaf11b5d4f8cf1d5acea92641b7483f212da4e88de29ff2d810fbf801b2ad0c4197bf6b67c3324b25e1964bf2df515d4d53538948457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-power-manager-doc"

RDEPENDS:${PN} += ""

inherit rpm
