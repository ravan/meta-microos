SUMMARY = "Documentation for texlive-colorwav"
DESCRIPTION = "This package includes the documentation for texlive-colorwav"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn67012"

RPM_NAME = "texlive-colorwav-doc-2026.226.1.0svn67012-60.2.noarch.rpm"
RPM_HASH = "d6e43a9bfb0204567ccb36c38f6f90946e19fdeb5686d5f1c1b1611bb117ac2f2b9903a99473fb21c5018429c77431b8d0bb073a21d4623407a8659d762ae088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorwav-doc"

RDEPENDS:${PN} += ""

inherit rpm
