SUMMARY = "Documentation for texlive-bookmark"
DESCRIPTION = "This package includes the documentation for texlive-bookmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn77682"

RPM_NAME = "texlive-bookmark-doc-2026.226.1.31svn77682-59.2.noarch.rpm"
RPM_HASH = "48ea0d32cd7a04bc2f92c92d22e9eeba940d232203ea894e6ce34cee39b4f9f14b3c10a0bef1ddf27eccaac4aaa60f15aedc98fe43901be524810201f1015f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
