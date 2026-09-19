SUMMARY = "Documentation for texlive-datetime2-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-doc-2026.226.1.2asvn47552-59.2.noarch.rpm"
RPM_HASH = "f3a733c6721b1b1b266b0f7a3bec1fba5997b04e1d302dc263800a9b40e038dd9d3b0787ba3f9ce3b43ea273cfa661a5620e07a2828a9945bd3149a89282f03f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
