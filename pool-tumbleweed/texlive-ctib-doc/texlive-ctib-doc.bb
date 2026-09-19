SUMMARY = "Documentation for texlive-ctib"
DESCRIPTION = "This package includes the documentation for texlive-ctib"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ctib-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "acd7bc3b849a76074240924fcd84dc8503bcc9d39b3b5466c3d988f7e4062cb54ab7ba7aa721371f9cb4425db733207aeb997ea404141b6a00815d6f41abbb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctib-doc"

RDEPENDS:${PN} += ""

inherit rpm
