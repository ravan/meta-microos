SUMMARY = "Documentation for texlive-hideanswer"
DESCRIPTION = "This package includes the documentation for texlive-hideanswer"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn72949"

RPM_NAME = "texlive-hideanswer-doc-2026.226.1.2svn72949-60.4.noarch.rpm"
RPM_HASH = "507e8d5912ea8c87a1c0ba501ff4a7f7794926aee8a989b6a1504b6de840750d7f9cd4cac6790e3a03a27239d241a488af232a2c72b4ba0cafa25bff71137704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideanswer-doc"

RDEPENDS:${PN} += ""

inherit rpm
