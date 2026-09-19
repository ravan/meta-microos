SUMMARY = "Documentation for texlive-realtranspose"
DESCRIPTION = "This package includes the documentation for texlive-realtranspose"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-realtranspose-doc-2026.226.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "1e5f0f295261a547102b17524897da1f13827d3ff85a87c98832b40ba0aad87fc0b6195e4d5625debed52cc2659d75652c5865b67371b976e7b3e45be6c4c6c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realtranspose-doc"

RDEPENDS:${PN} += ""

inherit rpm
