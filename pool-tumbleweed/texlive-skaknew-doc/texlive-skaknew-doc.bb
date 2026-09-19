SUMMARY = "Documentation for texlive-skaknew"
DESCRIPTION = "This package includes the documentation for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-skaknew-doc-2026.226.svn78101-64.2.noarch.rpm"
RPM_HASH = "330fbc700d72fb3f20baf9740a329e06ed145cbf2bc2e78de75f5cd1423cc1c66e4e1aca66b8cfcb310cf625764c8b9a3691e8c1bf4f94e413ce540797663eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skaknew-doc"

RDEPENDS:${PN} += ""

inherit rpm
