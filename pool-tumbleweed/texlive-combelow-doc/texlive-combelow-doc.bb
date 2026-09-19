SUMMARY = "Documentation for texlive-combelow"
DESCRIPTION = "This package includes the documentation for texlive-combelow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-doc-2026.226.0.0.99fsvn18462-60.2.noarch.rpm"
RPM_HASH = "ca8ebc0b343e8fdf31af6a27d90edac7d76d33872662e42ef32f2ffb5776f2a7433b3aa80efcd1723eb4d5f0048da717c67105ea557018a135ce25da2bb5a26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combelow-doc"

RDEPENDS:${PN} += ""

inherit rpm
