SUMMARY = "Convert document fragments into graphics"
DESCRIPTION = "The bundle simplifies and automates conversion of document \
fragments into external EPS or PDF files. The bundle consists \
of two parts: a LaTeX package that implements a document level \
interface, and a command line tool (written in lua) that \
generates the external graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn26313"

RPM_NAME = "texlive-cachepic-2026.226.1.0svn26313-59.2.noarch.rpm"
RPM_HASH = "0507085543aaa2740f937e24221415457d532b7e603b565397b8f26882742fc21c8e2ddd7e73f053e33f2ef6e99b3e94d2ecb335397c4cab1d47fa3b16009195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cachepic.sty \
tex-prcachepic.def \
texlive-cachepic"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-cachepic-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
