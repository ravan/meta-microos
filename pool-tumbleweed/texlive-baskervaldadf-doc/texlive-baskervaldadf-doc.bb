SUMMARY = "Documentation for texlive-baskervaldadf"
DESCRIPTION = "This package includes the documentation for texlive-baskervaldadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-baskervaldadf-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "520bbda546f12aee1c248b408f58ed99ed3f3028f0b20d2ad126eb9d518f3be80472831a3212a3c44d0539917ad58d961feb39c0452b6b5d94baf032e7b6db71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervaldadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
