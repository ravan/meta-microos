SUMMARY = "Documentation for texlive-figflow"
DESCRIPTION = "This package includes the documentation for texlive-figflow"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21462"

RPM_NAME = "texlive-figflow-doc-2026.226.svn21462-59.2.noarch.rpm"
RPM_HASH = "9215795929e06fc8441b5093b4893c90c43efeff455f3845ffd25595d6396b668967a0e996d926d27719b0ca92b522c21178cbbc6b3e6ba5a40c487aa741a70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
