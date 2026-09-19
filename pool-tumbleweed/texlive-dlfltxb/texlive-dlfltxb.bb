SUMMARY = "Macros related to 'Introdktion til LaTeX'"
DESCRIPTION = "The bundle contains various macros either used for creating the \
author's book 'Introduktion til LaTeX' (in Danish), or \
presented in the book as code tips. The bundle comprises: \
dlfltxbcodetips: various macros helpful in typesetting \
mathematics; dlfltxbmarkup: provides macros used throughout, \
for registering macro names, packages etc. in the text, in the \
margin and in the index, all by using categorised keys (note, a \
configuration file may be used; a sample is included in the \
distribution); dlfltxbtocconfig: macros for the two tables of \
contents that the book has; dlfltxbmisc: various macros for \
typesetting LaTeX arguments, and the macro used in the \
bibliography that can wrap a URL up into a BibTeX entry. \
Interested parties may review the book itself on the web at the \
author's institution (it is written in Danish)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17337"

RPM_NAME = "texlive-dlfltxb-2026.226.svn17337-59.2.noarch.rpm"
RPM_HASH = "7c6a1f354e2cfbb81bc6a42d2b5562b48bcb8d1b5ae6b056f2db6793b88fe1216af49a714426217ee62774cf2352d96d7e4fb2b9fa2415883d389f801e74820b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dlfltxbcodetips.sty \
tex-dlfltxbmarkup.sty \
tex-dlfltxbmarkupbookkeys.sty \
tex-dlfltxbmisc.sty \
tex-dlfltxbtocconfig.sty \
texlive-dlfltxb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-chngpage.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-ragged2e.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
