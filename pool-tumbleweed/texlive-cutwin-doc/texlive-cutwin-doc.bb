SUMMARY = "Documentation for texlive-cutwin"
DESCRIPTION = "This package includes the documentation for texlive-cutwin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-cutwin-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "78cf2170bddfcb1b1aac3baef7b3745d65a6ff823443b0b5d8c1f9024f3f6ddb6802969a4d706c8d9adcad86f4fb12deb0ed8ab7ef587e81350f9a95b018137f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cutwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
