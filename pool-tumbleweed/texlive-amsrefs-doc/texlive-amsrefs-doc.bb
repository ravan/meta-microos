SUMMARY = "Documentation for texlive-amsrefs"
DESCRIPTION = "This package includes the documentation for texlive-amsrefs"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn78101"

RPM_NAME = "texlive-amsrefs-doc-2026.226.2.14svn78101-61.2.noarch.rpm"
RPM_HASH = "01f69095d51ab70f5db2ab4d12abdd1d15b7cfc222457bbf0c005fcdb2761cdf19a9c74e1159ea20177ed2851c1c79fb103e4ef7649f53108c7daaaec0a181d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsrefs-doc"

RDEPENDS:${PN} += ""

inherit rpm
