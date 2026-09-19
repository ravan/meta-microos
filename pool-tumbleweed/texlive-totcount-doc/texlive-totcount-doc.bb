SUMMARY = "Documentation for texlive-totcount"
DESCRIPTION = "This package includes the documentation for texlive-totcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-totcount-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "4c6e4c81d476c139f424c62b8502234fb0ebd4229ff52dcb72fb62cb2adbebf8a932922cdf2c80bfa9817f7c633fe6086b5edbe4a2e48d51b329d3b832266d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
