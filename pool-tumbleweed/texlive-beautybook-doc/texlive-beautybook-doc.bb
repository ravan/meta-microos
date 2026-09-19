SUMMARY = "Documentation for texlive-beautybook"
DESCRIPTION = "This package includes the documentation for texlive-beautybook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-beautybook-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "d3862647684084f0b5bdc015e6d46f402ecdf144936fcba64fbb900d570823df27e53f1e6156d67366304403cc99d2ad95817c39f9d0fb5aa9a36dcc899f4ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beautybook-doc"

RDEPENDS:${PN} += ""

inherit rpm
