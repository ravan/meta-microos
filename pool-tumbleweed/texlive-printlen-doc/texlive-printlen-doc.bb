SUMMARY = "Documentation for texlive-printlen"
DESCRIPTION = "This package includes the documentation for texlive-printlen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-printlen-doc-2026.226.1.1asvn77682-59.2.noarch.rpm"
RPM_HASH = "96374ddcee62c2a3b9b0d257da9f5ad86f83e132bd7b97350dd418e8705833bfa6bb1de06b58e0c0dc93fed28af48ddda4ec0852cbd936a5f4a91ce2acf8a02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-printlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
