SUMMARY = "Documentation for texlive-memory"
DESCRIPTION = "This package includes the documentation for texlive-memory"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn30452"

RPM_NAME = "texlive-memory-doc-2026.226.1.2svn30452-59.2.noarch.rpm"
RPM_HASH = "4d865ca59ed3e5c42130d87b82a616994f89d1649db26d06aa92c6f9bd233e40a5379851eb75ee942c28b2de21b93428ac28b62be2069056b6df897d04ca6973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memory-doc"

RDEPENDS:${PN} += ""

inherit rpm
