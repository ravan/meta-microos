SUMMARY = "Documentation for texlive-colorist"
DESCRIPTION = "This package includes the documentation for texlive-colorist"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-colorist-doc-2026.226.svn78004-60.2.noarch.rpm"
RPM_HASH = "6ebe2c314196419061cdfab0f10d593e97a206d0f5d6b4a8e711d61c68384a32b17ba9886d053a0e46149c716b9229708e1ff126a8e81f8514b1d1be9efbfcbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorist-doc"

RDEPENDS:${PN} += ""

inherit rpm
