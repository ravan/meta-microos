SUMMARY = "Documentation for texlive-ucbthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucbthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-doc-2026.226.3.6svn51690-59.2.noarch.rpm"
RPM_HASH = "50a7efbc7d0c6b8a17224e8151367fb1f5610881ac5ce14037a515898a89cb4e58a5a32db4b0d20b597e1c0bee0d8079ea851d456f70438f23138d9f1554f471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucbthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
