SUMMARY = "Documentation for texlive-bibtex"
DESCRIPTION = "This package includes the documentation for texlive-bibtex"
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.99esvn77830"

RPM_NAME = "texlive-bibtex-doc-2026.226.0.0.99esvn77830-61.2.noarch.rpm"
RPM_HASH = "e292c944cfeeb92015cd1eef2ee894ffe8d2156d4fa3a788f5b6a01f12fd63caf2f10ab967663ee1bad1962d80e16c70a86d62a0b2e62b5cc3f18637157268ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex.1 \
texlive-bibtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
