SUMMARY = "Documentation for texlive-metago"
DESCRIPTION = "This package includes the documentation for texlive-metago"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-metago-doc-2026.226.0.0.9svn78101-61.2.noarch.rpm"
RPM_HASH = "5ee81533176539dd29faaf508031c50722ccc8d18718c76f460393b9ea87a43043fa9be4f80a78cdb9e02e44dcc41e262b9d8624b7b9c814ceda5eec529fbad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago-doc"

RDEPENDS:${PN} += ""

inherit rpm
