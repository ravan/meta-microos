SUMMARY = "Macros for Segmented Discourse Representation Theory"
DESCRIPTION = "The package provides macros to produce the 'Box notation' of \
SDRT (and DRT), to draw trees representing discourse relations, \
and finally to have an easy access to various mathematical \
symbols used in that theory, mostly with automatic mathematics \
mode, so they work the same in formulae and in text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-sdrt-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "0509eb23c0e82f873c16ce105363b6811c28776bfc96798322cff514e4071a8cc82ad22a8867a1a5b09d4f5d6ef849dd7070af145cf6dd89151a6e5f30a6d104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sdrt.sty \
texlive-sdrt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xyling.sty \
tex-xytree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
