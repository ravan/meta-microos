SUMMARY = "Documentation for texlive-lollipop"
DESCRIPTION = "This package includes the documentation for texlive-lollipop"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.07svn69742"

RPM_NAME = "texlive-lollipop-doc-2026.226.1.07svn69742-61.2.noarch.rpm"
RPM_HASH = "606eca2f92fee1286aff1759df20d2414835778b02e7cfedc291b44c044c614819eef77a2150869682f2abf2d5476cd7c8cf9dbb9c4994227d19f2c61f456bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lollipop-doc"

RDEPENDS:${PN} += ""

inherit rpm
