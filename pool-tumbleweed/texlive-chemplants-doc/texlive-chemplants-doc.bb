SUMMARY = "Documentation for texlive-chemplants"
DESCRIPTION = "This package includes the documentation for texlive-chemplants"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-doc-2026.226.0.0.9.9svn60606-60.2.noarch.rpm"
RPM_HASH = "ee6936a645c32a616ed45814129e11b382c081a42af02f7fcb2b2b5b4212835e998f9f9df03477eb2e439192481b3a5d8c370255a6b349bc1722d0a114b7d507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemplants-doc"

RDEPENDS:${PN} += ""

inherit rpm
