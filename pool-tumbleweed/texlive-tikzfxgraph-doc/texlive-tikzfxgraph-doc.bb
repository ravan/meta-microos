SUMMARY = "Documentation for texlive-tikzfxgraph"
DESCRIPTION = "This package includes the documentation for texlive-tikzfxgraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77050"

RPM_NAME = "texlive-tikzfxgraph-doc-2026.226.1.1svn77050-59.2.noarch.rpm"
RPM_HASH = "3ea01e9e57de4b77bb8d3fbe945dd66796803696cc56d2574936889623b9ef5f46f483a0ce7236aeab46ce21742d43ae2f1e480b2e03235b207f33fb2a302d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzfxgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
