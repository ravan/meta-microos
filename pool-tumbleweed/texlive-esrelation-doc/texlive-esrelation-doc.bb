SUMMARY = "Documentation for texlive-esrelation"
DESCRIPTION = "This package includes the documentation for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-esrelation-doc-2026.226.svn76924-59.2.noarch.rpm"
RPM_HASH = "0f99646638b89e6969872a08641a80f7e273d6fd94d7750fbeaf204802761050f479e0e32c8033e97894129fde649804c5b158ce2e5d41eb34038a538f91fea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esrelation-doc"

RDEPENDS:${PN} += ""

inherit rpm
