SUMMARY = "Documentation for texlive-pkfix-helper"
DESCRIPTION = "This package includes the documentation for texlive-pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn56061"

RPM_NAME = "texlive-pkfix-helper-doc-2026.226.1.6svn56061-58.2.noarch.rpm"
RPM_HASH = "8bb978919a42eb21a70b314e8a8e6caa220352363364535800593276cd7b0c3c3b31bb3759b001ed06a1fe7b4a7d8ecd29202078ff68296eb6b61e318e76ce95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pkfix-helper.1 \
texlive-pkfix-helper-doc"

RDEPENDS:${PN} += ""

inherit rpm
