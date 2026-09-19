SUMMARY = "Documentation for texlive-anyfontsize"
DESCRIPTION = "This package includes the documentation for texlive-anyfontsize"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-anyfontsize-doc-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "3ce018cc94393de663f3fa0baa5e1fd92221fc36fc474530ff081eb084893435ed7a69a52a6df0bab5342972fadd5bd8d9ebd4f9c1396039998732c5cdc8870c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anyfontsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
