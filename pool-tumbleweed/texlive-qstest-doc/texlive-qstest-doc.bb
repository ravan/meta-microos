SUMMARY = "Documentation for texlive-qstest"
DESCRIPTION = "This package includes the documentation for texlive-qstest"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73069"

RPM_NAME = "texlive-qstest-doc-2026.226.svn73069-60.4.noarch.rpm"
RPM_HASH = "d0a86bcc559df5e070cf83b30ca4fafb39b08ea1d6b9cf65e8f6421d6f0224d0b019e98afcabca62a2b793015c07b7aa1f55b33b03568f6e880edc2f5b0051fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qstest-doc"

RDEPENDS:${PN} += ""

inherit rpm
