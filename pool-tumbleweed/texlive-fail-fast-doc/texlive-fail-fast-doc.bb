SUMMARY = "Documentation for texlive-fail-fast"
DESCRIPTION = "This package includes the documentation for texlive-fail-fast"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn67543"

RPM_NAME = "texlive-fail-fast-doc-2026.226.0.0.0.2svn67543-59.2.noarch.rpm"
RPM_HASH = "a888d715629c3167e91f6813af54a7fde9490f08cbec7588c63a2ae2e3cab54a76f0e0b8b7453475c000e11c8bc9a0dec8a6e33cfe49f7ed4bd98be17a847360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fail-fast-doc"

RDEPENDS:${PN} += ""

inherit rpm
