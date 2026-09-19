SUMMARY = "Documentation for texlive-doclicense"
DESCRIPTION = "This package includes the documentation for texlive-doclicense"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3.0svn77682"

RPM_NAME = "texlive-doclicense-doc-2026.226.3.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "d87bae47cbfd84ee1beb06d8990cded3e904cc57c4c44fbb90e963a4015fbd221279ce3e7c8e65ad66b983a4d197bc9477ca314744895a3ceeaa8136662fa2ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doclicense-doc"

RDEPENDS:${PN} += ""

inherit rpm
