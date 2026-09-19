SUMMARY = "Documentation for texlive-adfathesis"
DESCRIPTION = "This package includes the documentation for texlive-adfathesis"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.42svn26048"

RPM_NAME = "texlive-adfathesis-doc-2026.226.2.42svn26048-61.2.noarch.rpm"
RPM_HASH = "c5655c0a613566f9f07ede8f2bdff69a0944ff6ab063b5f5d58db5c26ba4ed7dbfebeedb53ff91ac18fbb24817737e8a8e3637d4ba83b57b35b9c36fe0505df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
