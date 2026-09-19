SUMMARY = "Letter document class"
DESCRIPTION = "Designed for formatting formless letters in German; can also be \
used for English (by those who can read the documentation). \
There are LaTeX 2.09 documentstyle and LaTeX2e class files for \
both an 'old' and a 'new' version of g-brief."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.3svn77050"

RPM_NAME = "texlive-g-brief-2026.226.4.0.3svn77050-60.2.noarch.rpm"
RPM_HASH = "a8902016474bd648a63d7e96f81ed0450e90f15683e3f496fd7e06e9480d19e7ef6bba613488a4ac1b1f4941dfd1f0ed3cfd96ce9447bfd1eb4696d90030bb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-g-brief.cls \
tex-g-brief.sty \
tex-g-brief2.cls \
tex-g-brief2.sty \
texlive-g-brief"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-eurosym.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-letter.cls \
tex-marvosym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
