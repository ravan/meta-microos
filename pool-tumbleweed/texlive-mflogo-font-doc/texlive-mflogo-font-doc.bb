SUMMARY = "Documentation for texlive-mflogo-font"
DESCRIPTION = "This package includes the documentation for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2026.226.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-doc-2026.226.1.002svn54512-61.2.noarch.rpm"
RPM_HASH = "0b618deeef9a2541dea834dd02f0dd74df8123df23cd5ac0c7707763f4e1b49c9b81e1e8a6e64cfa8d6f8b618d5e85af815c9e1a41d3b7006b0ecc6f1e7fe0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
