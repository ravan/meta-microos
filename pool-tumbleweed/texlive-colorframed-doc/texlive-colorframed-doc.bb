SUMMARY = "Documentation for texlive-colorframed"
DESCRIPTION = "This package includes the documentation for texlive-colorframed"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn77682"

RPM_NAME = "texlive-colorframed-doc-2026.226.0.0.9bsvn77682-60.2.noarch.rpm"
RPM_HASH = "950f39d2fcedc8859a65cb7d50103a66b0db930694f57ff9d625429166934e4e0869fd5f6c01350c8f35beaaca231ec1719feb3c77481587061563e4b98c2120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorframed-doc"

RDEPENDS:${PN} += ""

inherit rpm
