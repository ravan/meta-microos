SUMMARY = "Documentation for texlive-upca"
DESCRIPTION = "This package includes the documentation for texlive-upca"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22511"

RPM_NAME = "texlive-upca-doc-2026.226.svn22511-60.2.noarch.rpm"
RPM_HASH = "af86f3c9434135040d0107088c2313df411e533a8948af15781092ddc532bf7d76f1b9dc9895857a24bb33e9f68e030485cf0abbbf955077ed3f0932dbfaee7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upca-doc"

RDEPENDS:${PN} += ""

inherit rpm
