SUMMARY = "Documentation for texlive-theanomodern"
DESCRIPTION = "This package includes the documentation for texlive-theanomodern"
LICENSE = "OFL-1.1"

PV = "2026.227.svn64520"

RPM_NAME = "texlive-theanomodern-doc-2026.227.svn64520-62.2.noarch.rpm"
RPM_HASH = "8e62316af00c2bb71aaf27dd737b8b938fdb578c9d0b0b83301bb58be8e92dce7c5584c2e1eb1d552c03bf8f2b58c40d820ec4aae55b0541d6de5b6c28edb4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanomodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
