SUMMARY = "Copyediting support for LaTeX documents"
DESCRIPTION = "This package implements copyediting support for LaTeX \
documents. Authors can enjoy the freedom of using, for example, \
words with US or UK or Canadian or Australian spelling in a \
mixed way, yet, they can choose any one of the usage forms for \
their entire document irrespective of kinds of spelling they \
have adopted. In the same fashion, the users can have the \
benefit of the following features available in the package: \
Localization -- British-American-Australian-Canadian Close-up, \
Hyphenation, and Spaced words Latin abbreviations Acronyms and \
Abbreviations Itemization, nonlocal lists and labels \
Parenthetical and serial commas Non-local tokenization in \
language through Abbreviations and pronouns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn37928"

RPM_NAME = "texlive-copyedit-2026.226.1.6svn37928-61.2.noarch.rpm"
RPM_HASH = "9ccd7e635af3a4394e05e336cea440b014b1874a6f5dcd2e775ddaa325c96d9d3033a2c2b0e4afb69e0614981920332608650461c16fb2e812e60d0c6c1acd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copyedit.sty \
texlive-copyedit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
