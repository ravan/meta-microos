SUMMARY = "Documentation for texlive-chngcntr"
DESCRIPTION = "This package includes the documentation for texlive-chngcntr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-chngcntr-doc-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "2cd1dc7163ac3a707bf7b3fc450a1e5bf74acd5c1b14c9e5f9054cd7c31bc25fb8349cbf97cf63f1e0212ac91c6fb49eea52cf5cc04bda79961a012a042db267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chngcntr-doc"

RDEPENDS:${PN} += ""

inherit rpm
