SUMMARY = "Documentation for texlive-economic"
DESCRIPTION = "This package includes the documentation for texlive-economic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-economic-doc-2026.226.svn76790-61.4.noarch.rpm"
RPM_HASH = "848f81f53f40efaf87a704f441173ff51cadef069a7c3d6785986d5e12122ebc0696173765b2d14a63d64493aa1b79d273a1d9bcf7b5b7bce193948b63b0f9d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-economic-doc"

RDEPENDS:${PN} += ""

inherit rpm
