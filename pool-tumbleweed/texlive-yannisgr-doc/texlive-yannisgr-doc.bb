SUMMARY = "Documentation for texlive-yannisgr"
DESCRIPTION = "This package includes the documentation for texlive-yannisgr"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22613"

RPM_NAME = "texlive-yannisgr-doc-2026.226.svn22613-59.4.noarch.rpm"
RPM_HASH = "ee7c4c6358febd8a2a7cbede2b5f1e8311710f1eb1c703b309b9a0f6a070c98e2ccee7223f888a7687ec30046b1ff0da465dc8d1d64230439bd7631a0996562a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yannisgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
