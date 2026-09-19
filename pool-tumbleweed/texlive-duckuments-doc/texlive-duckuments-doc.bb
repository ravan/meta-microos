SUMMARY = "Documentation for texlive-duckuments"
DESCRIPTION = "This package includes the documentation for texlive-duckuments"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-duckuments-doc-2026.226.0.0.5svn77682-59.2.noarch.rpm"
RPM_HASH = "c702a6693671609c80c2f59714f968246539cba0cb7f61dd4b56903ab75bfd76d56121015066b7bb9d36e6789f117e677f91e4160654143d96de774545bb201b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duckuments-doc"

RDEPENDS:${PN} += ""

inherit rpm
