SUMMARY = "Documentation for texlive-tokenizer"
DESCRIPTION = "This package includes the documentation for texlive-tokenizer"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-doc-2026.226.1.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "cda8a1d641e039dd8c892692d26ad6a52859901e8b973f0a40f3d634e2a28feff58940960a7a3a88e26453a64aca29049acfb34f812dbd440636ab92435452f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokenizer-doc"

RDEPENDS:${PN} += ""

inherit rpm
