SUMMARY = "Documentation for texlive-truthtable"
DESCRIPTION = "This package includes the documentation for texlive-truthtable"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn68300"

RPM_NAME = "texlive-truthtable-doc-2026.226.0.0.1.0svn68300-59.2.noarch.rpm"
RPM_HASH = "84de51718b59dc803ba411699ff8e4e1bfaed059155d077ea0c095dd5eaef6811f32bbe392af0ca6c0468b39e28ba19b23321dafa98d383b8cfef82ca8616a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
