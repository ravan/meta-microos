SUMMARY = "Export CTAN entries to bib format"
DESCRIPTION = "This package provides a Lua script which can be used for \
retrieving bibliographic information in BibLaTeX format for \
packages hosted on CTAN. The ctanbib script depends only on \
LuaXML."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2dsvn68650"

RPM_NAME = "texlive-ctanbib-2026.226.0.0.2dsvn68650-61.2.noarch.rpm"
RPM_HASH = "e64d9881c26a3fe5eb05ebde39fd3ee4598a4a99330f6944da1ea3d941c8f6a830adaa355ad6860fcac453813a4db6741d96c66f5b4142670a472c5e316b9f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanbib"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ctanbib-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
