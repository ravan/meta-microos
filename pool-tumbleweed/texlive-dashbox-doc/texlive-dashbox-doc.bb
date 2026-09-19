SUMMARY = "Documentation for texlive-dashbox"
DESCRIPTION = "This package includes the documentation for texlive-dashbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14svn77682"

RPM_NAME = "texlive-dashbox-doc-2026.226.1.14svn77682-61.2.noarch.rpm"
RPM_HASH = "4f7beaaf87a3625c0104b86d2d6936233767a68829e574f7d1e5089bc7939efc83e348973fb1dc0975469b1e510aba7cfcb1b981fe4eb5adb53d315f168e28bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
