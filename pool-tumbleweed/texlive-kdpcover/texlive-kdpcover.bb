SUMMARY = "Covers for books published by Kindle Direct Publishing"
DESCRIPTION = "The problem this class solves is the necessity to change the \
size of the cover PDF according to the number of pages in the \
book -- the bigger the book, the larger the spine of the book \
must be. The provided class makes the necessary calculations \
on-the-fly, using the qpdf tool. Obviously, you need to have it \
installed. Also, you must run pdflatex with the --shell-escape \
option, in order to allow LaTeX to run qpdf."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn74392"

RPM_NAME = "texlive-kdpcover-2026.226.0.0.6.1svn74392-63.2.noarch.rpm"
RPM_HASH = "536a184fb7054b22b630841a4607e989a535d269dcb85e4d78ffd37369e234e6016abdbff3d151972f0bd87a35d4269eead0c20ba2616c38ac8b9ef1fa38bae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kdpcover.cls \
texlive-kdpcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-calc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iexec.sty \
tex-microtype.sty \
tex-pgfopts.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-anyfontsize \
texlive-etoolbox \
texlive-filesystem \
texlive-geometry \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-microtype \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-textpos \
texlive-xcolor"

inherit rpm
