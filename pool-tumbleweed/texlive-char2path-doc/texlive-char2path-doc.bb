SUMMARY = "Documentation for texlive-char2path"
DESCRIPTION = "This package includes the documentation for texlive-char2path"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-char2path-doc-2026.226.1.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "7639e1ff5adcf34556de6717dc9b97f60f81b2c1b0ed720344d34ad33cb32efff5a46a75a3fa3ff8b42490652a7ad822e3e6e6938e0046883ebf8e24c7851431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-char2path-doc"

RDEPENDS:${PN} += ""

inherit rpm
