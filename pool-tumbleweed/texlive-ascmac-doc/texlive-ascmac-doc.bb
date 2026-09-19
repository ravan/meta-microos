SUMMARY = "Documentation for texlive-ascmac"
DESCRIPTION = "This package includes the documentation for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.1svn53411"

RPM_NAME = "texlive-ascmac-doc-2026.226.2.1svn53411-60.2.noarch.rpm"
RPM_HASH = "09b218da244afee15af6bb27357e78604c00948837a4d8177cd4e4826db2e52a399a4d3b99edbd769906d25adca2a181267ab34e194e6683e154105252ff886c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ascmac-doc-ja \
texlive-ascmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
