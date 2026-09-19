SUMMARY = "Documentation for texlive-inter"
DESCRIPTION = "This package includes the documentation for texlive-inter"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-inter-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "90b62bbaecd9c1a3077d3fc434dae816ea6fbf55aa7eb0d8276c7f0cc78228b5d416d9712468d742a39df3158b7c7327f28730e45ba4516d0d2d4471482c55d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inter-doc"

RDEPENDS:${PN} += ""

inherit rpm
