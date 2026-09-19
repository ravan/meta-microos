SUMMARY = "Documentation for texlive-babel-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-doc-2026.226.1.2gsvn31902-60.2.noarch.rpm"
RPM_HASH = "43f1b4b37f342b19de7863700d89b2f5690f6fb840dd0e409c53b29c6655c41de182585bfa4536902ba3cd35fae5bdf5fcde3eeaec2665b3e3dddaa8196f4794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bulgarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
