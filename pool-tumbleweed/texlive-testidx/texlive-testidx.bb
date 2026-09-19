SUMMARY = "Dummy text for testing index styles and indexing applications"
DESCRIPTION = "This is a LaTeX package that provides a command to produce \
dummy text interspersed with \\index commands to test an index \
style or indexing application. The dummy text is mostly in \
English, but includes extended Latin characters provided either \
through LaTeX accent commands or directly with UTF-8 \
characters, depending on the setup, to allow for testing \
extended Latin alphabets. The supplementary package \
testidx-glossaries.sty uses the indexing interface provided by \
the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn60966"

RPM_NAME = "texlive-testidx-2026.227.1.2svn60966-62.2.noarch.rpm"
RPM_HASH = "9877467e19521891e82c2eb77dbebf4c19f1e28d0e012f6f5dc516556f7077ff91dc2a8017099fb2b056d422c4d69cbb500b1651db3f4cf772e89542e1161df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-testidx-glossaries-diglyphs.tex \
tex-testidx-glossaries-nodiglyphs.tex \
tex-testidx-glossaries-samples.tex \
tex-testidx-glossaries.sty \
tex-testidx.sty \
texlive-testidx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-glossary-mcols.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
