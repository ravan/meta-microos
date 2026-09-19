SUMMARY = "Documentation for texlive-theanodidot"
DESCRIPTION = "This package includes the documentation for texlive-theanodidot"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn64518"

RPM_NAME = "texlive-theanodidot-doc-2026.227.svn64518-62.2.noarch.rpm"
RPM_HASH = "2b3adf182af8e9d9693b7a42fd2288b68acac87e504dddf482c6623825ce3dd6e3fae05a74ebc31e2dd63b711e32f7ff22eaa8f2b99550457efffdac75f6f187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanodidot-doc"

RDEPENDS:${PN} += ""

inherit rpm
