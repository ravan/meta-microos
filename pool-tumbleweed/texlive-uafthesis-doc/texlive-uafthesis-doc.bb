SUMMARY = "Documentation for texlive-uafthesis"
DESCRIPTION = "This package includes the documentation for texlive-uafthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.12.12svn57349"

RPM_NAME = "texlive-uafthesis-doc-2026.226.12.12svn57349-59.2.noarch.rpm"
RPM_HASH = "0547ea333ed5f8f9a613c0ff813c78a0de7801d3ce056c48e348f6923c9bbe3a5c6bb72b1708813f976040413b34ed3eb4da004b200838f2610e54162102483d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uafthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
