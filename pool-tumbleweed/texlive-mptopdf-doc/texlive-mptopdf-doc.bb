SUMMARY = "Documentation for texlive-mptopdf"
DESCRIPTION = "This package includes the documentation for texlive-mptopdf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78010"

RPM_NAME = "texlive-mptopdf-doc-2026.226.svn78010-61.2.noarch.rpm"
RPM_HASH = "f5b188200fb259fc726ea8c35dcc7ee3089d4179685f1339fdac4d86c6071c3cd095eeef38cbe7e7c787cc7c153ae16e0bad663d490ff8f2ef23a345258e70d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mptopdf.1 \
texlive-mptopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
