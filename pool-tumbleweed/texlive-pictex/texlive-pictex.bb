SUMMARY = "Picture drawing macros for TeX and LaTeX"
DESCRIPTION = "PicTeX is an early and very comprehensive drawing package that \
mostly draws by placing myriads of small dots to make up \
pictures. It has a tendency to run out of space; packages \
m-pictex and pictexwd deal with the problems in different ways."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn59551"

RPM_NAME = "texlive-pictex-2026.226.1.1bsvn59551-58.2.noarch.rpm"
RPM_HASH = "ec348f78a7eabdb4f22c876809e3423eab90aaeaa4e36fe31a2b69e552fe009c69db60f9f39bda0980b229fd8680bdcf8cc4318df40e11ad28c73f4983411806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-errorbars.tex \
tex-latexpicobjs.tex \
tex-piccorr.sty \
tex-picmore.tex \
tex-pictex.sty \
tex-pictex.tex \
tex-pictexwd.sty \
tex-pictexwd.tex \
tex-pointers.tex \
tex-postpictex.tex \
tex-prepictex.tex \
tex-texpictex.tex \
tex-tree.sty \
texlive-pictex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
