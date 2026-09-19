SUMMARY = "Documentation for texlive-mylatex"
DESCRIPTION = "This package includes the documentation for texlive-mylatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77050"

RPM_NAME = "texlive-mylatex-doc-2026.226.svn77050-61.2.noarch.rpm"
RPM_HASH = "acceacf1a6057d5a3bc31409f216ad5ce8fb2f7325f36234d747599f8240a8bab147d7a2dd4cd714847d91ceeed6e14366e9c9647daac30caf48e8b60caad7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
