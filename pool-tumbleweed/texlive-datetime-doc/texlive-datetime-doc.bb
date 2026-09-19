SUMMARY = "Documentation for texlive-datetime"
DESCRIPTION = "This package includes the documentation for texlive-datetime"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.60svn36650"

RPM_NAME = "texlive-datetime-doc-2026.226.2.60svn36650-61.2.noarch.rpm"
RPM_HASH = "ea518468a366c5447e9d91b3bf6f65d3d26a4979cb8ba62e1df0b4162214efefa9a6f06ad69e77ddf27a3b6c9b179b4ab0254841e11fde50016ae5758c2c8783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime-doc"

RDEPENDS:${PN} += ""

inherit rpm
