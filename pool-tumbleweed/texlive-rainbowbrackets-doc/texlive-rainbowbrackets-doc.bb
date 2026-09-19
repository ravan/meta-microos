SUMMARY = "Documentation for texlive-rainbowbrackets"
DESCRIPTION = "This package includes the documentation for texlive-rainbowbrackets"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn75976"

RPM_NAME = "texlive-rainbowbrackets-doc-2026.226.1.3.2svn75976-60.4.noarch.rpm"
RPM_HASH = "e6a5b4d282cbfb2a2ceb144057af592a46dbe3d9abca3cf0e1b9f00989be0a9b7e5575f126be87b6d8f6858619e2b355fb51e3f24059ca1a3a1c84405d0adfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rainbowbrackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
