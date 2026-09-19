SUMMARY = "Documentation for texlive-hacm"
DESCRIPTION = "This package includes the documentation for texlive-hacm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn27671"

RPM_NAME = "texlive-hacm-doc-2026.226.0.0.1svn27671-60.4.noarch.rpm"
RPM_HASH = "961cf664aab9edfa05f2f95a6dedacc25678a32c3bf549f971c0810c1a272e861d5a7b52885764a4c13d15d7ac5156bec28905b2a794e55091f112347625209b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hacm-doc"

RDEPENDS:${PN} += ""

inherit rpm
