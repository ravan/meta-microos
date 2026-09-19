SUMMARY = "Documentation for texlive-ehhline"
DESCRIPTION = "This package includes the documentation for texlive-ehhline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn54676"

RPM_NAME = "texlive-ehhline-doc-2026.226.1.1svn54676-61.4.noarch.rpm"
RPM_HASH = "ddce537edecaae77da35602ed51c2d8c29c14217b41362105c5d511bb677a4d25ba274831a7a35938658d551f2d81f96a200e4b3b305ea355ef4bdccc1d6deb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ehhline-doc"

RDEPENDS:${PN} += ""

inherit rpm
