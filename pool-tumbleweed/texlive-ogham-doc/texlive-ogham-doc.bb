SUMMARY = "Documentation for texlive-ogham"
DESCRIPTION = "This package includes the documentation for texlive-ogham"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn24876"

RPM_NAME = "texlive-ogham-doc-2026.226.svn24876-61.2.noarch.rpm"
RPM_HASH = "ed842cfbf250ea8b67dcba3bbc09f3109f90481973fa065c39c097536b97b7e08c04142978782da247eca1c99a19f703e035fa4adc355961dbc7a7d5a5b7c05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ogham-doc"

RDEPENDS:${PN} += ""

inherit rpm
