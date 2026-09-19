SUMMARY = "Documentation for texlive-xcjk2uni"
DESCRIPTION = "This package includes the documentation for texlive-xcjk2uni"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-doc-2026.226.1.0svn54958-59.4.noarch.rpm"
RPM_HASH = "8ea58c82295f2b41e8b1d4f9c478c02233239770a27b0347d175b0c119c5679b5be47c9e514f6aa1d9931798ffa8cb989ef1478b151fa4b4669ddf7bba926fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xcjk2uni-doc-zh \
texlive-xcjk2uni-doc"

RDEPENDS:${PN} += ""

inherit rpm
