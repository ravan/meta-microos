SUMMARY = "Documentation for texlive-pedigree-perl"
DESCRIPTION = "This package includes the documentation for texlive-pedigree-perl"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-doc-2026.226.2.1svn64227-58.2.noarch.rpm"
RPM_HASH = "2c9b5140b63ff2f958eda0c3e910e06a0f548ebc10768414e78916ae97a758d26c84aa28ec363c16aa389d85f2358c71056d1beacde43dad0638c3f2c5969e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pedigree.1 \
texlive-pedigree-perl-doc"

RDEPENDS:${PN} += ""

inherit rpm
