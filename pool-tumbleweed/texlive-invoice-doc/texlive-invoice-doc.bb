SUMMARY = "Documentation for texlive-invoice"
DESCRIPTION = "This package includes the documentation for texlive-invoice"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48359"

RPM_NAME = "texlive-invoice-doc-2026.226.svn48359-60.2.noarch.rpm"
RPM_HASH = "e613b4b84813402fbdf557924889315ae564f595310a936c00aecee29f8ed5c131b0ccba23c83ce44117e117789ab1d5e0a4165743aa1f387b9224c91ea18334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-doc"

RDEPENDS:${PN} += ""

inherit rpm
