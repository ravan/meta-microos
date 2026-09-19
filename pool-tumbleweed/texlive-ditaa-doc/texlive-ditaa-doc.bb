SUMMARY = "Documentation for texlive-ditaa"
DESCRIPTION = "This package includes the documentation for texlive-ditaa"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-doc-2026.226.0.0.9svn48932-59.2.noarch.rpm"
RPM_HASH = "8aeb4ba87233ee0440585f11b8d51a0202c425c08848d4f789b14daf6fce6cf03fc07488ff1fcfc18d594590d5f504580dbadf1b760ecb49e7f07c25035007dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ditaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
