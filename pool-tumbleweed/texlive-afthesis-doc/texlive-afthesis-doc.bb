SUMMARY = "Documentation for texlive-afthesis"
DESCRIPTION = "This package includes the documentation for texlive-afthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.7svn15878"

RPM_NAME = "texlive-afthesis-doc-2026.226.2.7svn15878-61.2.noarch.rpm"
RPM_HASH = "f5c4166ea18fcc63588e89aeb587bfcf937c22c6292d2683641c3ca82f28db083af05ba98a1b2b59c7a1fec67ef6992cac65a6ff3ead3729d49ccbe446bf773c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
