SUMMARY = "Documentation for texlive-iftex"
DESCRIPTION = "This package includes the documentation for texlive-iftex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0gsvn77682"

RPM_NAME = "texlive-iftex-doc-2026.226.1.0gsvn77682-60.2.noarch.rpm"
RPM_HASH = "0b2845200348ca89495fbcead2e936a18ee23baf80690ef10baa7a6a148155f7542c9e12f127d552d0cf0345a76fe8b8f8c31ebdd6f84306f7176b8eae318d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iftex-doc"

RDEPENDS:${PN} += ""

inherit rpm
