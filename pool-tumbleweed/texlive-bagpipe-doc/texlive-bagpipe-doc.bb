SUMMARY = "Documentation for texlive-bagpipe"
DESCRIPTION = "This package includes the documentation for texlive-bagpipe"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.02svn34393"

RPM_NAME = "texlive-bagpipe-doc-2026.226.3.02svn34393-60.2.noarch.rpm"
RPM_HASH = "385ebb535b0140b0868d66ea24bf4f80f1d53a2643ad65dbe0935156bc37b9ea5429c157a41204354903d2f48521cbf3ab429a5be57cb67eeea3512397a0ea16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bagpipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
