SUMMARY = "Documentation for texlive-amnestyreport"
DESCRIPTION = "This package includes the documentation for texlive-amnestyreport"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn69439"

RPM_NAME = "texlive-amnestyreport-doc-2026.226.1.2svn69439-61.2.noarch.rpm"
RPM_HASH = "dcbdb459ff5a1f9ff35890275f3e3a7b5e4b5e4742ace0c631d07ad952e75bd10516ea706eecc97a5fdb5c1fc6bdb3c982a5e4c80247c6241636c548472c3788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amnestyreport-doc"

RDEPENDS:${PN} += ""

inherit rpm
