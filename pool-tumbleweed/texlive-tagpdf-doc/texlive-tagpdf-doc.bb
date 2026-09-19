SUMMARY = "Documentation for texlive-tagpdf"
DESCRIPTION = "This package includes the documentation for texlive-tagpdf"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.99ysvn77539"

RPM_NAME = "texlive-tagpdf-doc-2026.227.0.0.99ysvn77539-62.2.noarch.rpm"
RPM_HASH = "d92733048a2f390282a135f80dab907c6531bc8789afbee788eec0a739e14dc2c313b6c922df33998de501e6be315cfe563c92c177b09dccf784855738896a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
