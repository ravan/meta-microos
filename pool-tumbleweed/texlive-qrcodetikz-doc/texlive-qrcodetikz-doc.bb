SUMMARY = "Documentation for texlive-qrcodetikz"
DESCRIPTION = "This package includes the documentation for texlive-qrcodetikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-qrcodetikz-doc-2026.226.1.0svn76924-60.4.noarch.rpm"
RPM_HASH = "bb7bec8fe134704371ce02c0b7951fcc77063691e5656920d20a532f2165ac5e08c9a1b06ec0d6e5e2cac6a22d7938d49b2d0b1a066a02466657a168919e8ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcodetikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
