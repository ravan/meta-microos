SUMMARY = "Documentation for texlive-sty2dtx"
DESCRIPTION = "This package includes the documentation for texlive-sty2dtx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4svn76924"

RPM_NAME = "texlive-sty2dtx-doc-2026.226.2.4svn76924-64.2.noarch.rpm"
RPM_HASH = "29ee55c432e6e76ac7719fb24c3f729d735753223f3c2358d11d58ee50ece4813f7f74d8bcfe1c837a68e838316a441e54e0816c2017820cf7e4111ab3eb712c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-sty2dtx.1 \
texlive-sty2dtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
