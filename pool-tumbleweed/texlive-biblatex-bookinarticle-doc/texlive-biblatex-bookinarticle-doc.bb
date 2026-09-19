SUMMARY = "Documentation for texlive-biblatex-bookinarticle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinarticle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-doc-2026.226.1.3.1asvn40323-61.2.noarch.rpm"
RPM_HASH = "f9a713ad63599a31aa58df0986441d6e26eabc745247c978710d61a6e8b4d5e41b7c565b6c7bb57a77e030cfe1d1ef2c0b54b1cdedbf07277ce676f15c8c8da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
