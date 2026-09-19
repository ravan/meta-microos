SUMMARY = "Documentation for texlive-finstrut"
DESCRIPTION = "This package includes the documentation for texlive-finstrut"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-doc-2026.226.0.0.5svn21719-59.2.noarch.rpm"
RPM_HASH = "8b00460d7ce91c51aa34ae0b06fe38ddde9b5208df087c8cedc7b9760ab1161afed285db67b0beff280769e3ce0db95d79a9c18ae9e93456ed2be4eaf3cd067e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finstrut-doc"

RDEPENDS:${PN} += ""

inherit rpm
