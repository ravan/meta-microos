SUMMARY = "Documentation for texlive-akktex"
DESCRIPTION = "This package includes the documentation for texlive-akktex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.2svn26055"

RPM_NAME = "texlive-akktex-doc-2026.226.0.0.3.2svn26055-61.2.noarch.rpm"
RPM_HASH = "145fe050c019d4a56e6f1945af399dc8fe982941e240332ecb8143624fd7ddef582f7e80e508423fe582b400f703307ed79abea67402224ac95db5e6b9522592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akktex-doc"

RDEPENDS:${PN} += ""

inherit rpm
