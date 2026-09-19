SUMMARY = "Documentation for texlive-gitinfo-lua"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo-lua"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn72284"

RPM_NAME = "texlive-gitinfo-lua-doc-2026.226.1.2.0svn72284-60.4.noarch.rpm"
RPM_HASH = "534512dbf2b3d9c20a021b9d8d41f86ec1e5a1709c6bd7eb014376eae3e9e5211b44d7f4a79e7c26dc525376f177f0cd43b9a8d0fd46f5cde7b68d3388a9dc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
