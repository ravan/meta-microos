SUMMARY = "Documentation for texlive-datatool-regions"
DESCRIPTION = "This package includes the documentation for texlive-datatool-regions"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75712"

RPM_NAME = "texlive-datatool-regions-doc-2026.226.1.0svn75712-61.2.noarch.rpm"
RPM_HASH = "0af9345d54afef2c0a563e15bada5a2bfea09061fe098a3eeee84ad6e53914961bd8417d0676e5cbbaa9df90d7b43c5d8e1283c44a972bd458b8d6d3510b9711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datatool-regions-doc"

RDEPENDS:${PN} += ""

inherit rpm
