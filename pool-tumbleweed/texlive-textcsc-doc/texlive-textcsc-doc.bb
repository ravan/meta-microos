SUMMARY = "Documentation for texlive-textcsc"
DESCRIPTION = "This package includes the documentation for texlive-textcsc"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2.0svn67193"

RPM_NAME = "texlive-textcsc-doc-2026.227.1.2.0svn67193-62.2.noarch.rpm"
RPM_HASH = "08729c74ea59a43ed3302d97ac49fcf3246979dc83b446a98e6fbba9f46451c58557c429c5dde352b7749d26e9c366d78e8fa9ced08756b27e5894b37f3319c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
