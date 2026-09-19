SUMMARY = "Documentation for texlive-treesvr"
DESCRIPTION = "This package includes the documentation for texlive-treesvr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71382"

RPM_NAME = "texlive-treesvr-doc-2026.226.svn71382-59.2.noarch.rpm"
RPM_HASH = "5d1cfd501eefba60b00d574b0b79fa3adc3e46649cd4f70b5cc0a6a2f6080badf9e6617f30bb039062729def4790503cf5d4c6c3617fba1b706290f93ee8e142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-treesvr-doc"

RDEPENDS:${PN} += ""

inherit rpm
