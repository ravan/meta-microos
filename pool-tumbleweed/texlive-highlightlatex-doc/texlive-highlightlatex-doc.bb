SUMMARY = "Documentation for texlive-highlightlatex"
DESCRIPTION = "This package includes the documentation for texlive-highlightlatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58392"

RPM_NAME = "texlive-highlightlatex-doc-2026.226.svn58392-60.4.noarch.rpm"
RPM_HASH = "0764ab9653ae3e6ac8696746fea058bbe3c998e7963349a627f325690eabc8002aa9ad86dabcb398fb6e9ee84deb3b835bd96e68b53455c89c063d1d39c8d4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-highlightlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
