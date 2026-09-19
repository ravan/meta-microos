SUMMARY = "Documentation for texlive-slixte"
DESCRIPTION = "This package includes the documentation for texlive-slixte"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76913"

RPM_NAME = "texlive-slixte-doc-2026.226.svn76913-64.2.noarch.rpm"
RPM_HASH = "092b821e58830d0c09c117fce2a30f89dba10ad74d3a93ba0c44c5a2784e5b8448b5ecf17fde33fd0edf25aa8640391ccd2570f3acb7447b942a099d4a276b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slixte-doc"

RDEPENDS:${PN} += ""

inherit rpm
