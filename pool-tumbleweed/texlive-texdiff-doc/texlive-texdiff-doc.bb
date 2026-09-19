SUMMARY = "Documentation for texlive-texdiff"
DESCRIPTION = "This package includes the documentation for texlive-texdiff"
LICENSE = "Artistic-1.0"

PV = "2026.227.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-doc-2026.227.0.0.4svn29752-62.2.noarch.rpm"
RPM_HASH = "1839cccaf4b16e8815321eb2cb4b83bf6859165239b8d0c9d9e4109d4d27db6342bde96795186f426b2c0ef09670cdb009d967d068cf4778db1b6f5ea60ea064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdiff.1 \
texlive-texdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
