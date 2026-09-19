SUMMARY = "Documentation for texlive-undar-digitacion"
DESCRIPTION = "This package includes the documentation for texlive-undar-digitacion"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0svn69742"

RPM_NAME = "texlive-undar-digitacion-doc-2026.226.0.0.0svn69742-60.2.noarch.rpm"
RPM_HASH = "1151cc1d8ef45de66ec7409b220e267bf165e6e9a7c30c210214155a704c2a73a80031ce98c906644ee0de557ad8148aca9e249208d7cc8b0fee0ec4cc70f297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undar-digitacion-doc"

RDEPENDS:${PN} += ""

inherit rpm
