SUMMARY = "Documentation for texlive-rsfso"
DESCRIPTION = "This package includes the documentation for texlive-rsfso"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn78101"

RPM_NAME = "texlive-rsfso-doc-2026.226.1.03svn78101-60.2.noarch.rpm"
RPM_HASH = "b68a3b2774bfb4339bb0e6ed29f351cd4546b873bb1823059eb823aa8c1150911d0b72a5bd0b3f3c590fa08e2aaa81915c1a8c8887a40c17b6cec311e71839c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfso-doc"

RDEPENDS:${PN} += ""

inherit rpm
