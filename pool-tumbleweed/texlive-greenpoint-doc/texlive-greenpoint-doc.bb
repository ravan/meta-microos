SUMMARY = "Documentation for texlive-greenpoint"
DESCRIPTION = "This package includes the documentation for texlive-greenpoint"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-greenpoint-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "a62f3345f3de9ae86d141791a9757bb6e7558875eeadc94cb4be23c617768611a5fde1f3b76bc9b1603d0831c15a428712ddf61e253cb6b4b4b25a97b5814431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greenpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
