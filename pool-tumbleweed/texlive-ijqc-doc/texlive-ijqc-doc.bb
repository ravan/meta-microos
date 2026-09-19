SUMMARY = "Documentation for texlive-ijqc"
DESCRIPTION = "This package includes the documentation for texlive-ijqc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76790"

RPM_NAME = "texlive-ijqc-doc-2026.226.1.2svn76790-60.2.noarch.rpm"
RPM_HASH = "27ef622cbf45f9ce9a7e6aeedf411db787f75cae406fbfe12a95c1dbd4952b9b09133a6e4ea2cd5b9da911af44e19b48873dfb39ae8fd6b95dbd2cc3ed0ea274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc-doc"

RDEPENDS:${PN} += ""

inherit rpm
