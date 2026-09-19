SUMMARY = "Documentation for texlive-stringstrings"
DESCRIPTION = "This package includes the documentation for texlive-stringstrings"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24svn77682"

RPM_NAME = "texlive-stringstrings-doc-2026.226.1.24svn77682-64.2.noarch.rpm"
RPM_HASH = "241bcae8c8f7733d6ca499e33cbcca6d4006c9b3d0db9dbd845d6a4fd99d00b70be1782d707a565679c4bb7f07f7de3fc09eb9953a73ea89775b1bb77ba89ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringstrings-doc"

RDEPENDS:${PN} += ""

inherit rpm
