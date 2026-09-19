SUMMARY = "Documentation for texlive-xkcdcolors"
DESCRIPTION = "This package includes the documentation for texlive-xkcdcolors"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn67895"

RPM_NAME = "texlive-xkcdcolors-doc-2026.226.1.0.2svn67895-59.4.noarch.rpm"
RPM_HASH = "69235f597ae5d3629a572ac656ef3c695b25ab9c134e9c7b1b5d5f695b4d274693cd8aebcc31b82009147ca394eb3200204d4265d6f8c7857afa57030b4b0433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkcdcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
