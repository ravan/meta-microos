SUMMARY = "Documentation for texlive-soton"
DESCRIPTION = "This package includes the documentation for texlive-soton"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn16215"

RPM_NAME = "texlive-soton-doc-2026.226.0.0.1svn16215-64.2.noarch.rpm"
RPM_HASH = "6eb4272990eb8f0b20c4de5dfc0fa5698e10ae66ea1173cb24967188a78ce7b4564bcf9d09c6a28425dd57401dac95bea17d74eb6d069efce499f55ab09337c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soton-doc"

RDEPENDS:${PN} += ""

inherit rpm
