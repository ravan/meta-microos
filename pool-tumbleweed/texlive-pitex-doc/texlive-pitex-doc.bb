SUMMARY = "Documentation for texlive-pitex"
DESCRIPTION = "This package includes the documentation for texlive-pitex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24731"

RPM_NAME = "texlive-pitex-doc-2026.226.svn24731-58.2.noarch.rpm"
RPM_HASH = "53f856950263831a2e6a7f0789ab2293bf8feb9609d707c234546cf1928ab5432afbec026700f454c1ef082c49f5d057e6532a3b36eb8c0883296ee1a8deb664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
