SUMMARY = "Documentation for texlive-archaeologie"
DESCRIPTION = "This package includes the documentation for texlive-archaeologie"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.0svn76790"

RPM_NAME = "texlive-archaeologie-doc-2026.226.2.5.0svn76790-61.2.noarch.rpm"
RPM_HASH = "a70bf58f0c750be639b9b3de60e831afab02a461bc851b14e88fcff0b366727da69c08a6a639d454fa343335be27fad091764bde6d7c83ffc82810a6c64c6814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaeologie-doc"

RDEPENDS:${PN} += ""

inherit rpm
