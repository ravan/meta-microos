SUMMARY = "Documentation for texlive-luatex"
DESCRIPTION = "This package includes the documentation for texlive-luatex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78218"

RPM_NAME = "texlive-luatex-doc-2026.226.svn78218-59.2.noarch.rpm"
RPM_HASH = "cd347157b71d92e2a296963e731fb3400eaf7bf3bd3898d0eb8836eae2c483bf99f8bfd5c4da514e72188bbda5d64772220100448ac8c3c87eb77ed36155b514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviluatex.1 \
man-luatex.1 \
man-texlua.1 \
man-texluac.1 \
texlive-luatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
