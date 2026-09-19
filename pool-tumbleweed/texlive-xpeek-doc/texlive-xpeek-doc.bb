SUMMARY = "Documentation for texlive-xpeek"
DESCRIPTION = "This package includes the documentation for texlive-xpeek"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-doc-2026.226.0.0.2svn61719-59.4.noarch.rpm"
RPM_HASH = "f7ceeb9a4892ba07f26b277dc496953ba9c683443cc984027b6014c667fd5b9fec5e049de4e451aa033b28577f64241d21132f633c8113ceee115f99f71788e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeek-doc"

RDEPENDS:${PN} += ""

inherit rpm
