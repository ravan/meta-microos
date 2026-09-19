SUMMARY = "Documentation for texlive-easy-todo"
DESCRIPTION = "This package includes the documentation for texlive-easy-todo"
LICENSE = "Apache-1.0"

PV = "2026.226.svn32677"

RPM_NAME = "texlive-easy-todo-doc-2026.226.svn32677-61.4.noarch.rpm"
RPM_HASH = "f9ee05b58075c5cf4016c617de697fd3e238dbd52ce7f902f483ee85ef86abe1653749fafe9ba9d9033dcbf2e6654eea317a680aa4a80d426d16e6e9bb76f814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
