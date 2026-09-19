SUMMARY = "Documentation for texlive-lutabulartools"
DESCRIPTION = "This package includes the documentation for texlive-lutabulartools"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73345"

RPM_NAME = "texlive-lutabulartools-doc-2026.226.svn73345-59.2.noarch.rpm"
RPM_HASH = "e0cc3bf49d14a09edb20f5aac55edbcc639a50eba26016f064e5520ea5d7bac7fabecaaf771d3a0642d0a590f6f6feefbbaf303e1de3250f756d5bf2893f9549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lutabulartools-doc"

RDEPENDS:${PN} += ""

inherit rpm
