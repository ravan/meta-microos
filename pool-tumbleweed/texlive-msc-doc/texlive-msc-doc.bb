SUMMARY = "Documentation for texlive-msc"
DESCRIPTION = "This package includes the documentation for texlive-msc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn67718"

RPM_NAME = "texlive-msc-doc-2026.226.2.00svn67718-61.2.noarch.rpm"
RPM_HASH = "054c8049da5ded5023b3f8b4b4db2db0a5f98a6425bc80436be3de9b6ecabccab53b6ebf6148de8793f3bc794095c2d55e61d3ddd90df2062e48527c97c26ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msc-doc"

RDEPENDS:${PN} += ""

inherit rpm
