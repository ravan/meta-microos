SUMMARY = "Documentation for texlive-physics-patch"
DESCRIPTION = "This package includes the documentation for texlive-physics-patch"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn76924"

RPM_NAME = "texlive-physics-patch-doc-2026.226.3.1svn76924-58.2.noarch.rpm"
RPM_HASH = "d8bab46c9ebe3bcd88ea52dad47130337d9b634a78fca4ea28c7b8b3a0c537ce7eefbf9407b75d10cc1017ea55f4b3e50592bc5734947a700db58c86b82ba859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics-patch-doc"

RDEPENDS:${PN} += ""

inherit rpm
