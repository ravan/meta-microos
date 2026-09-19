SUMMARY = "Documentation for texlive-tokcycle"
DESCRIPTION = "This package includes the documentation for texlive-tokcycle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74841"

RPM_NAME = "texlive-tokcycle-doc-2026.226.1.5svn74841-59.2.noarch.rpm"
RPM_HASH = "2cecae7006c8a0c871d2c121dfa9325d17025a5c4c0cfbebf437074d9ca198eb4dc4c620dd898ba4be8de8a118adc02c79299d45f4a7b8046fe697c780bc587c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokcycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
