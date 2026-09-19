SUMMARY = "Creating random integer number lists, with repeating and sorting options"
DESCRIPTION = "This package (like luarandom, but without the obligation to use \
LuaLaTeX) provides some macros for creating random integer \
number lists between a and b. This list can have multiple \
numbers or not, and this list can be sorted or not."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78007"

RPM_NAME = "texlive-randintlist-2026.226.0.0.20asvn78007-60.4.noarch.rpm"
RPM_HASH = "da9e6bcc1942c71d543a96ffa6e8706467ce85d0b75196d59c6ab0a9d5dd7f77cf6376f38f40f13022d93952e0b69085a20c1c256a11fe796a3aeeb3c78f3945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randintlist-l3.sty \
tex-randintlist.sty \
texlive-randintlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-randomlist.sty \
tex-simplekv.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
