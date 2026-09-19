SUMMARY = "Documentation for texlive-proflabo"
DESCRIPTION = "This package includes the documentation for texlive-proflabo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn63147"

RPM_NAME = "texlive-proflabo-doc-2026.226.1.0svn63147-59.2.noarch.rpm"
RPM_HASH = "91a0a0427060cb23931905ad02291801be5041c5f93c7066c96ed7a8568114aae0c34238cdbe9d18a0ea5285e1083efa7a0ee604f5597340cf3fa583159636bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proflabo-doc"

RDEPENDS:${PN} += ""

inherit rpm
