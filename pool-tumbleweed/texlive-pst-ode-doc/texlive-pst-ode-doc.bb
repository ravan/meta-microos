SUMMARY = "Documentation for texlive-pst-ode"
DESCRIPTION = "This package includes the documentation for texlive-pst-ode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn69296"

RPM_NAME = "texlive-pst-ode-doc-2026.226.0.0.19svn69296-59.2.noarch.rpm"
RPM_HASH = "8a1ab9dd11c2bb32f6b4833ca012fc727dc7e0baaf84a7746753cfeb1bc8902ef90ec7991dc2477071f186a776201f20ba10842e9c167c57e6d2ce9d864eb0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
