SUMMARY = "Documentation for texlive-chronology"
DESCRIPTION = "This package includes the documentation for texlive-chronology"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67973"

RPM_NAME = "texlive-chronology-doc-2026.226.2.0svn67973-60.2.noarch.rpm"
RPM_HASH = "4124587afed42d6663eab45db64256831130e8f1651a685d5da57d4f509cb934d66c37122ba084c5595b14c7091d84cc0811b964b5bfe0d7519718b99b6f8f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chronology-doc"

RDEPENDS:${PN} += ""

inherit rpm
