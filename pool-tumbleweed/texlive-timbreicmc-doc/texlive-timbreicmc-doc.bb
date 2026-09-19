SUMMARY = "Documentation for texlive-timbreicmc"
DESCRIPTION = "This package includes the documentation for texlive-timbreicmc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-doc-2026.226.2.0svn49740-59.2.noarch.rpm"
RPM_HASH = "a505e070278479a2c76ae7124f837786103157068197261983cd74ea4b90e46624b4e59af005888196b5b66417f01bcc20da0880b8bfe7790e58578a68fa4b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timbreicmc-doc"

RDEPENDS:${PN} += ""

inherit rpm
