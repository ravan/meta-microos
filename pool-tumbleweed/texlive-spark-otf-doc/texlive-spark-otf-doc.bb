SUMMARY = "Documentation for texlive-spark-otf"
DESCRIPTION = "This package includes the documentation for texlive-spark-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.05asvn77682"

RPM_NAME = "texlive-spark-otf-doc-2026.226.0.0.05asvn77682-64.2.noarch.rpm"
RPM_HASH = "849ab4b564f14e8c8150ebfc75cc74538ed58f60f1de1c99397e10aa5fb5c890a35cf4f97fc31f975d9e2426a44ecaff79035ae2bd2886e333a5a774d363269b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spark-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
