SUMMARY = "Typeset dropped capitals"
DESCRIPTION = "The lettrine package supports various dropped capitals styles, \
typically those described in the French typographic books. In \
particular, it has facilities for the paragraph text's left \
edge to follow the outline of capitals that have a regular \
shape (such as 'A' and 'V')."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.83svn77053"

RPM_NAME = "texlive-lettrine-2026.226.2.83svn77053-61.2.noarch.rpm"
RPM_HASH = "564483f575c5f1b4695fc9845ca0da8b72785942bf84a46e09be2907ac4af5ca0a0c39319a7751117c57f1a8337b9bcff08a6f2cdd09dfce17265560c72bf2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lettrine-2006-03-17.sty \
tex-lettrine-2015-08-31.sty \
tex-lettrine-2018-08-18.sty \
tex-lettrine-2022-09-25.sty \
tex-lettrine-2023-04-18.sty \
tex-lettrine.cfg \
tex-lettrine.sty \
texlive-lettrine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-minifp.sty \
tex-xfp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
