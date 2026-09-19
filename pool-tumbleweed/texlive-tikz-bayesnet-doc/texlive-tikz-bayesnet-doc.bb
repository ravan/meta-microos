SUMMARY = "Documentation for texlive-tikz-bayesnet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bayesnet"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-doc-2026.227.0.0.1svn38295-62.2.noarch.rpm"
RPM_HASH = "227efc2c8b072b67f331479e8160e0df56f7988e25afa56f49faf5de76272c8ebd181661c9e62390d307a4f5066a69d41e84b5b482e5851217ad6bcdc7144e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bayesnet-doc"

RDEPENDS:${PN} += ""

inherit rpm
