SUMMARY = "Documentation for texlive-tudscr"
DESCRIPTION = "This package includes the documentation for texlive-tudscr"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.06osvn64085"

RPM_NAME = "texlive-tudscr-doc-2026.226.2.06osvn64085-59.2.noarch.rpm"
RPM_HASH = "f7c4bace23fc2594f729489779c5447ef12181638e9972f2115391601f140b5611056196413729d48137ccfc3f7664af7b7e07d4b40ffb40ed6476bfdc6b8905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tudscr-doc-de \
texlive-tudscr-doc"

RDEPENDS:${PN} += ""

inherit rpm
