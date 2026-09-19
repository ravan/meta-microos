SUMMARY = "Documentation for texlive-functional"
DESCRIPTION = "This package includes the documentation for texlive-functional"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024csvn76924"

RPM_NAME = "texlive-functional-doc-2026.226.2024csvn76924-60.2.noarch.rpm"
RPM_HASH = "6b353957ab0829f27cc067ddfc8eb375ed2af11c55612d4600a7a69f750be62319803708def7854d3ac4089cd15bc23e6df6a0a1ad7353c08555d5c13afa30c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functional-doc"

RDEPENDS:${PN} += ""

inherit rpm
