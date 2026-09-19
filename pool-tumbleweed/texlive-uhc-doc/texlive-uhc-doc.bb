SUMMARY = "Documentation for texlive-uhc"
DESCRIPTION = "This package includes the documentation for texlive-uhc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn16791"

RPM_NAME = "texlive-uhc-doc-2026.226.svn16791-60.2.noarch.rpm"
RPM_HASH = "a01b8138a44fd244cc895cf6cbe4cb235204a24cdb9e9c62e730f50efe41241612a926f8f48a42a1816afcccc9babcf2c045736f9c636e49c683e6a5dd7d8f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhc-doc"

RDEPENDS:${PN} += ""

inherit rpm
