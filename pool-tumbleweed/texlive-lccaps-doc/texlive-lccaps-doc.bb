SUMMARY = "Documentation for texlive-lccaps"
DESCRIPTION = "This package includes the documentation for texlive-lccaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn46432"

RPM_NAME = "texlive-lccaps-doc-2026.226.1.0svn46432-61.2.noarch.rpm"
RPM_HASH = "2418a8957a06f964d95924bba178beae510bd08828d1c1ed7a6a252a48b1bea568b12a75ddf341fa8d4931ac0fd227aedee9ac4fd3aadfc0e85e6084744db730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lccaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
