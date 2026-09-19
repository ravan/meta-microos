SUMMARY = "Documentation for texlive-flippdf"
DESCRIPTION = "This package includes the documentation for texlive-flippdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-flippdf-doc-2026.226.2.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "6850f1ca4c1646ed6c2fb176cf71955ea863d2bde07a64007e6250c3e7843c0c109833890a225914e981c537c2a9a5aaeb4078033c909ac42ffc3cf9d00827d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flippdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
