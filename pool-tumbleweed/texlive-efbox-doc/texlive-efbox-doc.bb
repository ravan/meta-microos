SUMMARY = "Documentation for texlive-efbox"
DESCRIPTION = "This package includes the documentation for texlive-efbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-efbox-doc-2026.226.1.0svn77682-61.4.noarch.rpm"
RPM_HASH = "ccf6fbc585a895a70b8ac207b4726cc6651ee60e1739479f9d5a0e86660485a28df68c4526c9b40d65bbb761938b3721f5a2a4e0d14fb8628ad82085c1fdd5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-efbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
