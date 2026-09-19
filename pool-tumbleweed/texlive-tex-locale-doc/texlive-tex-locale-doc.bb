SUMMARY = "Documentation for texlive-tex-locale"
DESCRIPTION = "This package includes the documentation for texlive-tex-locale"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn77682"

RPM_NAME = "texlive-tex-locale-doc-2026.227.1.0svn77682-62.2.noarch.rpm"
RPM_HASH = "aeb701ddac5ff8bee9b05ff5b80cc3407be53fdcc457827f24f53267317a04ad561ec8db4d6303b265eac0fc010712a1643240dd7036bc1315dac7af36036774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-locale-doc"

RDEPENDS:${PN} += ""

inherit rpm
