SUMMARY = "Documentation for texlive-noto"
DESCRIPTION = "This package includes the documentation for texlive-noto"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-noto-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "add4cabc28a17755d548cb3b5c578ddba840fe7e0da92299979bf77f27c34e2f0e79bfa97b12f0d147bde62df04b2e17238ce765a69e7a73cbee64f254ce0d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-doc"

RDEPENDS:${PN} += ""

inherit rpm
