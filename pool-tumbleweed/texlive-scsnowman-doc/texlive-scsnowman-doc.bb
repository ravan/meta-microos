SUMMARY = "Documentation for texlive-scsnowman"
DESCRIPTION = "This package includes the documentation for texlive-scsnowman"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-doc-2026.226.1.3csvn66115-60.2.noarch.rpm"
RPM_HASH = "012c1a002c22582f5ab79658abd38610476ce1f2a338c61e97d7bee18d20cfa4b4ca65a4244fdd0a88a90c2a727f0314148d9588d385d9bce85b8fd6661cba20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scsnowman-doc-ja \
texlive-scsnowman-doc"

RDEPENDS:${PN} += ""

inherit rpm
