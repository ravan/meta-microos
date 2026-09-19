SUMMARY = "Embed Gnuplot commands in LaTeX documents"
DESCRIPTION = "This package allows you to include Gnuplot graphs in your LaTeX \
documents. The gnuplot code is extracted from the document and \
written to .gnuplot files. Then, if shell escape is used, the \
graph files are automatically processed to graphics or LaTeX \
code files which will then be included in the document. If \
shell escape isn't used, the user will have to manually convert \
the files by running gnuplot on the extracted .gnuplot files."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-2026.226.0.0.9.5svn54758-60.4.noarch.rpm"
RPM_HASH = "a408a9271b6059b06c0cd94087661c9ed70abf34540e6fff7acdec564341fe37721da2641c7cd022b6f7974bf3858e00bb0f79266200bd9c6258f7bbde1d99d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gnuplottex.sty \
texlive-gnuplottex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
