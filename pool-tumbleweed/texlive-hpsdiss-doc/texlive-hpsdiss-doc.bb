SUMMARY = "Documentation for texlive-hpsdiss"
DESCRIPTION = "This package includes the documentation for texlive-hpsdiss"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "8d6a94e7783e25fc3f9429fc53cf8654b6ec9819c716411ef1b8d656e46224a71c1f9621f04c163c987b40c5ae7e8580e1b0f42f169662cc7b5f8ff9826a962d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hpsdiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
