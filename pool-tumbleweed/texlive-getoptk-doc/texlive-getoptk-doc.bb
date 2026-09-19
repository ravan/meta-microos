SUMMARY = "Documentation for texlive-getoptk"
DESCRIPTION = "This package includes the documentation for texlive-getoptk"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn23567"

RPM_NAME = "texlive-getoptk-doc-2026.226.1.0svn23567-60.2.noarch.rpm"
RPM_HASH = "1d88b5cd12d1396ed3dc7a31c1cc05418ccdd3aae718020a6e228e16e416b90640a56e313ea227ebb44c83fdfe59ad6ea6ea79c3f6ccabbfb5cc7489d80770c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getoptk-doc"

RDEPENDS:${PN} += ""

inherit rpm
