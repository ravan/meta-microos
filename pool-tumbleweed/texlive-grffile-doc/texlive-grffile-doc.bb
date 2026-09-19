SUMMARY = "Documentation for texlive-grffile"
DESCRIPTION = "This package includes the documentation for texlive-grffile"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78101"

RPM_NAME = "texlive-grffile-doc-2026.226.2.1svn78101-60.4.noarch.rpm"
RPM_HASH = "7a642cf5a4702484bdaf56caf81e0602ba1e3668a21d3ca633d875921baa0730f3704a184dc2a9b4f7ba2a02e65aff7314c79adabc2448b931edde55d0314a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grffile-doc"

RDEPENDS:${PN} += ""

inherit rpm
