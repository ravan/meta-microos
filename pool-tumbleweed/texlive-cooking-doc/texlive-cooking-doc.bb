SUMMARY = "Documentation for texlive-cooking"
DESCRIPTION = "This package includes the documentation for texlive-cooking"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-doc-2026.226.0.0.9bsvn15878-61.2.noarch.rpm"
RPM_HASH = "54fd2264ae11de13218e339536e0eeada3c4755ebfe5e5a21ac4154b215056f343d3dfa1ed0bdb3c42f6443838bee0d744323f5068f80547dbd7c570273e15d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-doc"

RDEPENDS:${PN} += ""

inherit rpm
