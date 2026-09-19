SUMMARY = "Documentation for texlive-todo"
DESCRIPTION = "This package includes the documentation for texlive-todo"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.142svn17746"

RPM_NAME = "texlive-todo-doc-2026.226.2.142svn17746-59.2.noarch.rpm"
RPM_HASH = "ba0da292ab28f8a7655115b3bc8f7a7c12d03b64aa71ae09d63b9cc8391e0a1d806d235b149e3127bc15e05cd4221b1c19640a77614583520fa5b9baa02648f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
