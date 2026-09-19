SUMMARY = "Documentation for texlive-blkarray"
DESCRIPTION = "This package includes the documentation for texlive-blkarray"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-blkarray-doc-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "8adf979ffd4522efc6781237b2e2b088097836994aecbef7dd6367da51eda4c0073e050722d560fd573ea62a3074852e8153e10124935ffb7ea9711abce32c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blkarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
