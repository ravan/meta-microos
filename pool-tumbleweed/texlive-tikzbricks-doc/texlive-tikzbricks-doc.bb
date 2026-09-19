SUMMARY = "Documentation for texlive-tikzbricks"
DESCRIPTION = "This package includes the documentation for texlive-tikzbricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn73140"

RPM_NAME = "texlive-tikzbricks-doc-2026.226.0.0.6svn73140-59.2.noarch.rpm"
RPM_HASH = "52d5921f969e29a0a41b3d9d33348ff60040a265f2c18e1e914c27947e8833dfee35365da684acfed5e85814524b4125c379d6d254bce7cdf912383e9c4725ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzbricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
