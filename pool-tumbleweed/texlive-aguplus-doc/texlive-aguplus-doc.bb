SUMMARY = "Documentation for texlive-aguplus"
DESCRIPTION = "This package includes the documentation for texlive-aguplus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-doc-2026.226.1.6bsvn17156-61.2.noarch.rpm"
RPM_HASH = "8fb92aaefa76f0e6be99d7ba5a3b41d94f42782966fc7bcb6413970f9da0873878856d50ff20e74a67a393b2915dc7545e8e3f7c621c0f613df0063d5dbfbda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aguplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
