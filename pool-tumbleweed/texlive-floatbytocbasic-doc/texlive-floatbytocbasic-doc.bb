SUMMARY = "Documentation for texlive-floatbytocbasic"
DESCRIPTION = "This package includes the documentation for texlive-floatbytocbasic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67945"

RPM_NAME = "texlive-floatbytocbasic-doc-2026.226.1.0svn67945-60.2.noarch.rpm"
RPM_HASH = "9d8856a6eadd8282f3fcedac028bb3f9dff59beed20f231c155e7363d7591c9bb819d7b38cacb0a6e0746c4bf765f8ec5ff642d31b6cf8cc0624b18f88bcedbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-floatbytocbasic-doc"

RDEPENDS:${PN} += ""

inherit rpm
