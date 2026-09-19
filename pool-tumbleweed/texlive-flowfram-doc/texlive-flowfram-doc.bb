SUMMARY = "Documentation for texlive-flowfram"
DESCRIPTION = "This package includes the documentation for texlive-flowfram"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78101"

RPM_NAME = "texlive-flowfram-doc-2026.226.2.1svn78101-60.2.noarch.rpm"
RPM_HASH = "0983715e288e24c1f7b898f6f1543cb0ff06b895f005eacd6b6496ccb9fd509b9ea5190e1d46af96776ab1c386587a184a4019ed8e5ffcdb26d09808d56a389a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowfram-doc"

RDEPENDS:${PN} += ""

inherit rpm
