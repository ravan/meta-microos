SUMMARY = "University of Texas at Austin graduate thesis style"
DESCRIPTION = "This class file complies with the Digital Submission \
Requirement for Masters and Ph.D. thesis submissions of the \
University of Texas at Austin."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-2026.226.1.0svn48648-60.2.noarch.rpm"
RPM_HASH = "0b2ad700d039bb0bc06f824d5af6c475b08f8a3850a9d0d24550e46c71429919ab3920047f68759ab795bd563d45997b12e528765cd9863c59d34aedc0daa70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utexasthesis.cls \
texlive-utexasthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-doi.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-indentfirst.sty \
tex-natbib.sty \
tex-report.cls \
tex-setspace.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
