SUMMARY = "Documentation for texlive-endiagram"
DESCRIPTION = "This package includes the documentation for texlive-endiagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1dsvn76924"

RPM_NAME = "texlive-endiagram-doc-2026.226.0.0.1dsvn76924-61.4.noarch.rpm"
RPM_HASH = "1e151876555ad51b0e75c647afc9fd99a61d8f02898fc242ce3713f85629e834ce29008246a55784eafd904443dde3e985007c478189d7d39218d60a498caef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
