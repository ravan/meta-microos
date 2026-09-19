SUMMARY = "Documentation for texlive-bussproofs-colorful"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs-colorful"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77507"

RPM_NAME = "texlive-bussproofs-colorful-doc-2026.226.1.0svn77507-59.2.noarch.rpm"
RPM_HASH = "8646a506b423dd05f9418856ee20a67d0f0a42e1e626edbe957bc2df37241ab5aca2cad49b10b38c6c3100f66c8c0376577a779e7ac705d5f67d0dc389c455a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-colorful-doc"

RDEPENDS:${PN} += ""

inherit rpm
