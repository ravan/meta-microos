SUMMARY = "Documentation for libdbusmenu - GTK 2 and GTK 3"
DESCRIPTION = "This package contains the documentation for the dbusmenu-gtk2 and dbusmenu-gtk3 \
libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-doc-16.04.0-13.4.noarch.rpm"
RPM_HASH = "fabec82abb3e423e0be2f318cfbafead99a92ea37aba2e6d847c0740bc9948cfa9957f4b2b3401451a8c1cf191ba067641ba3cb6bf9fc174a5dc05934d17f634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-gtk2-doc"

RDEPENDS:${PN} += ""

inherit rpm
