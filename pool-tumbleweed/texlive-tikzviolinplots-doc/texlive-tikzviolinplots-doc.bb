SUMMARY = "Documentation for texlive-tikzviolinplots"
DESCRIPTION = "This package includes the documentation for texlive-tikzviolinplots"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10.0svn76451"

RPM_NAME = "texlive-tikzviolinplots-doc-2026.226.0.0.10.0svn76451-59.2.noarch.rpm"
RPM_HASH = "07bea5c4e6179bf8b42df9ce21aedf2df1a09f5d6ef402159f9b4ca0f5c7f4d154e0f0898b8cf43348e1626b9a4cc4d7403cab8185bee4ae813ce1b6a162e7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzviolinplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
