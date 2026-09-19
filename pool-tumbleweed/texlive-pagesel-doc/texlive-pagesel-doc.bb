SUMMARY = "Documentation for texlive-pagesel"
DESCRIPTION = "This package includes the documentation for texlive-pagesel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-pagesel-doc-2026.226.1.10svn77682-58.2.noarch.rpm"
RPM_HASH = "db4f2c5f72408b12e625e0c4fc5a1787c729020c6cf7e1bfde7d6340253df9d9c6652cd7bdfa61e23d9c5cb4a93ec0bf3e828bed283b9a454f0ef4eac2dc9a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pagesel-doc-en \
texlive-pagesel-doc"

RDEPENDS:${PN} += ""

inherit rpm
