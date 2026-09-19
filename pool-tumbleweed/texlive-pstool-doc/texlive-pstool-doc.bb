SUMMARY = "Documentation for texlive-pstool"
DESCRIPTION = "This package includes the documentation for texlive-pstool"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn46393"

RPM_NAME = "texlive-pstool-doc-2026.226.1.5esvn46393-60.4.noarch.rpm"
RPM_HASH = "1ab947a37e36d0fa3c32a54f9e12de69b5b1b1dbd3343664fed8cd10b58899e69a1f888f1011f0e6e67b45440a801a4cf865b897e46b4e128e1d8ba62a57e145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstool-doc"

RDEPENDS:${PN} += ""

inherit rpm
