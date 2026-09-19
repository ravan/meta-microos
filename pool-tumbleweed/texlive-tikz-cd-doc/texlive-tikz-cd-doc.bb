SUMMARY = "Documentation for texlive-tikz-cd"
DESCRIPTION = "This package includes the documentation for texlive-tikz-cd"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn77682"

RPM_NAME = "texlive-tikz-cd-doc-2026.227.1.0svn77682-62.2.noarch.rpm"
RPM_HASH = "a3b6fa680f1db8b08166f48face9be370a0e7a4d7213198b35b32c5d02f88a33e827611fafa1b833ac1317d180dc370699baa499f906decf232060de25a956ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-cd-doc"

RDEPENDS:${PN} += ""

inherit rpm
