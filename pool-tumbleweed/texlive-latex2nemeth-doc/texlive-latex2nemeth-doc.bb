SUMMARY = "Documentation for texlive-latex2nemeth"
DESCRIPTION = "This package includes the documentation for texlive-latex2nemeth"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.3svn76924"

RPM_NAME = "texlive-latex2nemeth-doc-2026.226.1.1.3svn76924-61.2.noarch.rpm"
RPM_HASH = "b97399c3d5e592dd51152471ac39abceba7951a3abbe0785e67b22ae34b27fa09fa346b66a540570502691e35e76f3322cde807089b043cc7638a4b8b3cf43ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2nemeth-doc"

RDEPENDS:${PN} += ""

inherit rpm
