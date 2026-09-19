SUMMARY = "E-TeX tools for LaTeX users and package writers"
DESCRIPTION = "The package provides many (purely expandable) tools for LaTeX: \
Extensive list management (csv lists, lists of single \
tokens/characters, etoolbox lists); purely expandable loops \
(csvloop, forcsvloop, etc.); conversion (csvtolist, etc.)); \
addition/deletion (csvadd, listdel, etc.); Expansion and group \
control: \\expandnext, \\ExpandAfterCmds, \\AfterGroup...; Tests \
on tokens, characters and control sequences (\\iffirstchar, \
\\ifiscs, \\ifdefcount, \\@ifchar...); Tests on strings \
(\\ifstrnum, \\ifuppercase, \\DeclareStringFilter...); Purely \
expandable macros with options (\\FE@testopt, \\FE@ifstar) or \
modifiers (\\FE@modifiers); Some purely expandable numerics \
(\\interval, \\locinterplin). The package is dependent on the \
etex and the etoolbox packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415926svn20694"

RPM_NAME = "texlive-etextools-2026.226.3.1415926svn20694-59.2.noarch.rpm"
RPM_HASH = "99b2864a3c0db3e68493ff0ab1d5373f8279394c1b67b81856cf30108827a241b2a1cbb37dd33016ea3b99e3fea1d2a9d041a1ac9c8e21f0d66c99c6ac44d467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etextools.sty \
texlive-etextools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
