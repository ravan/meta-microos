SUMMARY = "Documentation for texlive-tucv"
DESCRIPTION = "This package includes the documentation for texlive-tucv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn20680"

RPM_NAME = "texlive-tucv-doc-2026.226.1.0svn20680-59.2.noarch.rpm"
RPM_HASH = "c81ab7cb789f091573110eef2202e7b02c32d47873ac249850423ed2207208a70363cf7e45b247e501290fa393daf7e17aa162820b117a68610a848a8e007b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tucv-doc"

RDEPENDS:${PN} += ""

inherit rpm
