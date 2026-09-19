SUMMARY = "Documentation for texlive-dinat"
DESCRIPTION = "This package includes the documentation for texlive-dinat"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.5svn76790"

RPM_NAME = "texlive-dinat-doc-2026.226.2.5svn76790-59.2.noarch.rpm"
RPM_HASH = "0f84ef9cb7028cd5a2aeebeafa9a22f80b50569cbafc35fc5e8add0e5deee09e062fa538eeb732f8c25725ab1f0315bb0fc1ec3f0662e27d83deccb7120fe1c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dinat-doc-de \
texlive-dinat-doc"

RDEPENDS:${PN} += ""

inherit rpm
