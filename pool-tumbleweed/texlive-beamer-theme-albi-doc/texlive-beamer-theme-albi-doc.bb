SUMMARY = "Documentation for texlive-beamer-theme-albi"
DESCRIPTION = "This package includes the documentation for texlive-beamer-theme-albi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74899"

RPM_NAME = "texlive-beamer-theme-albi-doc-2026.226.1.5svn74899-61.2.noarch.rpm"
RPM_HASH = "0a3c63ffad77925997a5616afa699f8cb9279cbf6bafceae9e910f784b7a8deabbfedbef98ec940da280ac0c433cb67449d7decc7a51d52d80ead89f0217e8aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-theme-albi-doc"

RDEPENDS:${PN} += ""

inherit rpm
