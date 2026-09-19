SUMMARY = "Documentation for texlive-multienv"
DESCRIPTION = "This package includes the documentation for texlive-multienv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64967"

RPM_NAME = "texlive-multienv-doc-2026.226.1.0svn64967-61.2.noarch.rpm"
RPM_HASH = "506d14e023fa4c0b895d19d113c238bdbaef64df3655cf74c2b05b5b48de7b9e8332d06ec53beb08093ace3dc5518d5b2a431afb1a08e64fa1007daffa7af4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multienv-doc"

RDEPENDS:${PN} += ""

inherit rpm
