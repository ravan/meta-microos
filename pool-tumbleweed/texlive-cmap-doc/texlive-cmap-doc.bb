SUMMARY = "Documentation for texlive-cmap"
DESCRIPTION = "This package includes the documentation for texlive-cmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0jsvn77682"

RPM_NAME = "texlive-cmap-doc-2026.226.1.0jsvn77682-60.2.noarch.rpm"
RPM_HASH = "0ad06c03b105ee14d18e30e50fb7b20d6614a1d55355e5e64511ee3fca0730665f1d4a1109e51205e8c5223f758b4d55aed3a9cf5d83f8d3987a739de728be5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
