SUMMARY = "Documentation for texlive-perception"
DESCRIPTION = "This package includes the documentation for texlive-perception"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-perception-doc-2026.226.svn76790-58.2.noarch.rpm"
RPM_HASH = "dcf2f066b2118911e16c8efc987a01441defcaa6ca4d80ab6b2038950ffaf749b1d9899b1d7e5aa4845ac0ed8c5891b3897c6f135b1b13e285306e42e91db35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception-doc"

RDEPENDS:${PN} += ""

inherit rpm
