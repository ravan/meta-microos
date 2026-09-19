SUMMARY = "Documentation for texlive-moderntimeline"
DESCRIPTION = "This package includes the documentation for texlive-moderntimeline"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-doc-2026.226.0.0.11svn55518-61.2.noarch.rpm"
RPM_HASH = "d2e93dab73670144b3703c567475ca151d1b9c80d1668a287401394d90897c4337b11ae979877f68eada5b4a31b7a3509bb125988ea66153add043f1cd282039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderntimeline-doc"

RDEPENDS:${PN} += ""

inherit rpm
