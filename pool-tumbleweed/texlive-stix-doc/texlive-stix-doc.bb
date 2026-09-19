SUMMARY = "Documentation for texlive-stix"
DESCRIPTION = "This package includes the documentation for texlive-stix"
LICENSE = "OFL-1.1"

PV = "2026.226.1.1.3svn78101"

RPM_NAME = "texlive-stix-doc-2026.226.1.1.3svn78101-64.2.noarch.rpm"
RPM_HASH = "62ad1d501614dd89604656c2d18858554c8bba487c2f8f5952c94129e5c667df7013b70d7eae65b502341a2bbc965976d01eea7f92378d0086d5d3292986d47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix-doc"

RDEPENDS:${PN} += ""

inherit rpm
