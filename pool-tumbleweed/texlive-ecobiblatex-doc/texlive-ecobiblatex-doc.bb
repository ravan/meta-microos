SUMMARY = "Documentation for texlive-ecobiblatex"
DESCRIPTION = "This package includes the documentation for texlive-ecobiblatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-doc-2026.226.1.0svn39233-61.4.noarch.rpm"
RPM_HASH = "96385572c80a62b769936aaeb936b96f3e921eb02a96e5785153d6eca5a6398e5ed88305777214a776e76d458ec1d43b339d97ef9b139f69658eea2556faaf7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecobiblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
