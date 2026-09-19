SUMMARY = "Documentation for texlive-drawstack"
DESCRIPTION = "This package includes the documentation for texlive-drawstack"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28582"

RPM_NAME = "texlive-drawstack-doc-2026.226.svn28582-59.2.noarch.rpm"
RPM_HASH = "b97f1e8e3ad1927a75e1127146bcddb8f903c4fbb3a911a102ed5b4c4349f851dcbfd61a169005c910c4f3275a6f876d9c42a692b65273a23629cbc010d2591c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawstack-doc"

RDEPENDS:${PN} += ""

inherit rpm
