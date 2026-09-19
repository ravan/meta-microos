SUMMARY = "Documentation for texlive-yamlvars"
DESCRIPTION = "This package includes the documentation for texlive-yamlvars"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73922"

RPM_NAME = "texlive-yamlvars-doc-2026.226.svn73922-59.4.noarch.rpm"
RPM_HASH = "dc07e79ac85fe9f381242ef571f1295850c2d2679375f3607a2129811dfdbc74fe0d908bf451593b9aedab453894c944fb91f9bf2f78ca4f8af2ff94f7d0d8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yamlvars-doc"

RDEPENDS:${PN} += ""

inherit rpm
