SUMMARY = "Documentation for texlive-emf"
DESCRIPTION = "This package includes the documentation for texlive-emf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn76790"

RPM_NAME = "texlive-emf-doc-2026.226.1svn76790-61.4.noarch.rpm"
RPM_HASH = "06a765b38c6e86d6cf796a782e2fbb7e45735de7935a1026abd5e526ee2a4d6dec548b4444cc5a15f763ed2b89f8a919d3e8d31ff46bf74311fa549a8b20db73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emf-doc"

RDEPENDS:${PN} += ""

inherit rpm
