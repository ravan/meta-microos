SUMMARY = "Documentation for texlive-utf8mex"
DESCRIPTION = "This package includes the documentation for texlive-utf8mex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-utf8mex-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "10e5fd71ae121c839fabf3d3b27e8b9f79bb2ac37f74fc5d567c4530f390b82131823e5f8b74e49fd8d030cee81ca90f1f2d6c01fa40db7f3a2cc6de5f023745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8mex-doc"

RDEPENDS:${PN} += ""

inherit rpm
