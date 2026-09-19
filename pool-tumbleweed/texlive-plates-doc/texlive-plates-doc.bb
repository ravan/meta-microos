SUMMARY = "Documentation for texlive-plates"
DESCRIPTION = "This package includes the documentation for texlive-plates"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-plates-doc-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "0ebf95c5086a2fcfae8d529f0abfadbd969eee5c0af57b5836f40d9c0a5e2ebd3fee463b38726ca2b635cb93aa3c4e35d32872660e51b866005320b2e57c37c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plates-doc"

RDEPENDS:${PN} += ""

inherit rpm
