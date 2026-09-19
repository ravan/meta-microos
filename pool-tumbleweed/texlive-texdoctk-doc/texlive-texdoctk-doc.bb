SUMMARY = "Documentation for texlive-texdoctk"
DESCRIPTION = "This package includes the documentation for texlive-texdoctk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-doc-2026.227.0.0.6.0svn62186-62.2.noarch.rpm"
RPM_HASH = "1ca06d67a703cd2a5ebaa231f9b0799e92ab5ee39e1f6686b2453ab02f76e06419b2e5c87a958518aefef250a7b0425eeed4fa51a1a29dc453c888877883ef14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdoctk.1 \
texlive-texdoctk-doc"

RDEPENDS:${PN} += ""

inherit rpm
