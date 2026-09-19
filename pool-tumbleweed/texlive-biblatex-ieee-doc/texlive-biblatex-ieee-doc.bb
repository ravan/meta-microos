SUMMARY = "Documentation for texlive-biblatex-ieee"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ieee"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4fsvn75952"

RPM_NAME = "texlive-biblatex-ieee-doc-2026.226.1.4fsvn75952-61.2.noarch.rpm"
RPM_HASH = "61042f018653a9318b07fbd7617bafb469cd7d5032eaf78d392692da6f8b71fe19af122cc8598bf31c3787735ad9cc9346c3df6a51e78466c1cf036c883dc293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ieee-doc"

RDEPENDS:${PN} += ""

inherit rpm
