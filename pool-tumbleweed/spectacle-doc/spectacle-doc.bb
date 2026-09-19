SUMMARY = "Documentation for Spectacle"
DESCRIPTION = "This package contains the documentation available for Spectacle, which is a \
screenshot capture program by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "spectacle-doc-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "2126c32a06b67f1a4c17487f4a53881a33ff468035448f4350613e74da6715070194ac09b5b6e7122adf9c9449fe9fcdac9835f83d15392da78acf66e2aba79d"

RPROVIDES:${PN} += "spectacle-doc"

RDEPENDS:${PN} += "spectacle"

inherit rpm
