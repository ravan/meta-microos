SUMMARY = "Create listoffigures etc. in a single chapter"
DESCRIPTION = "The package allows you to create a list of figures and list of \
tables in a chapter named 'List' that contains separate \
sections for each list of figures, tables, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20333"

RPM_NAME = "texlive-smalltableof-2026.226.svn20333-64.2.noarch.rpm"
RPM_HASH = "83f6164d0c849f2eb491f39979383e8b2b52b473b242d71641c2712804e35bd085525ae49193c855c9fd55d5073d45f832d26461c60714991e048dfcb98ebf0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smalltableof.sty \
texlive-smalltableof"

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
