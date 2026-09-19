SUMMARY = "Documentation for texlive-storecmd"
DESCRIPTION = "This package includes the documentation for texlive-storecmd"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-doc-2026.226.0.0.0.2svn24431-64.2.noarch.rpm"
RPM_HASH = "faa0aa83b2ad72f4c6d025da7c6209f726a20883d078d6336de23678639ffa77c4402ec1ac765ce0bc4e1e2cafb2e6bc34a3f2ddbdc3e8305f4f4bd0a7534dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storecmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
