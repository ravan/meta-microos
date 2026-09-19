SUMMARY = "Babel contributed support for French"
DESCRIPTION = "The package, formerly known as frenchb, establishes French \
conventions in a document (or a subset of the conventions, if \
French is not the main language of the document)."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0esvn77682"

RPM_NAME = "texlive-babel-french-2026.226.4.0esvn77682-60.2.noarch.rpm"
RPM_HASH = "da7548b0058891c7af15066d6156d2480bc599894d2c4c44c37941e07c1e00a1a554d4c0f58058245a3f78ee31deba2a7598a008f33ab0599d36216341809d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acadian.ldf \
tex-canadien.ldf \
tex-francais.ldf \
tex-french.ldf \
tex-french3.ldf \
tex-frenchb.ldf \
texlive-babel-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
