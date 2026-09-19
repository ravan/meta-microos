SUMMARY = "Documentation for texlive-babel-serbianc"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbianc"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-doc-2026.226.3.2asvn64588-60.2.noarch.rpm"
RPM_HASH = "c4f0d5f7a266b8eba5213d2c59077f73efca5beff53179e23efa06dcd970b7672ea649c2d3b941c22605f1eca5d5d4f0d84ab77fc57b366dac6caa63ef41d326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbianc-doc"

RDEPENDS:${PN} += ""

inherit rpm
