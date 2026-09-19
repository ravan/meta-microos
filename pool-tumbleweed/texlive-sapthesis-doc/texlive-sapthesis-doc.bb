SUMMARY = "Documentation for texlive-sapthesis"
DESCRIPTION = "This package includes the documentation for texlive-sapthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1svn63810"

RPM_NAME = "texlive-sapthesis-doc-2026.226.5.1svn63810-60.2.noarch.rpm"
RPM_HASH = "bb85b0669740b90c5fff9c1139a5d16bbc065b0511529c31b0d4d15499a38236f6eb600a482c32080e95e03e2245672953b0825292281e9e22ea6b1dcd34f309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sapthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
