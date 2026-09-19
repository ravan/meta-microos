SUMMARY = "Documentation for texlive-ocr-b"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20852"

RPM_NAME = "texlive-ocr-b-doc-2026.226.svn20852-61.2.noarch.rpm"
RPM_HASH = "e3ae7c4be0f3f9310c3c979b548c36387c2eb46e3113bfd31441adf85d8214de429ceaf1e837a3f642d82511e3bf9900ee45251d8ff6296b898d7e3f2c5920ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-doc"

RDEPENDS:${PN} += ""

inherit rpm
