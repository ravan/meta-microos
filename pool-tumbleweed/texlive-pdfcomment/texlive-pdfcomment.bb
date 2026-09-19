SUMMARY = "A user-friendly interface to pdf annotations"
DESCRIPTION = "For a long time pdfLaTeX has offered the command \\pdfannot for \
inserting arbitrary PDF annotations. However, the command is \
presented in a form where additional knowledge of the \
definition of the PDF format is indispensable. This package is \
an answer to the - occasional - questions in newsgroups, about \
how one could use the comment function of Adobe Reader. At \
least for the writer of LaTeX code, the package offers a \
convenient and user-friendly means of using \\pdfannot to \
provide comments in PDF files. Since version v1.1, \
pdfcomment.sty also supports LaTeX - dvips - ps2pdf, LaTeX - \
dvipdfmx, XeLaTeX and LuaLaTeX. Unfortunately, support of PDF \
annotations by PDF viewers may vary. The reference viewer for \
the development of this package is Adobe Reader."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4asvn77682"

RPM_NAME = "texlive-pdfcomment-2026.226.2.4asvn77682-58.2.noarch.rpm"
RPM_HASH = "3aab8284a9057df54754e7d745e30eb06631f3b9c96a0f20292e22c771ff126f416b6e6c995ceb6a6b7128acc180372aa216c03c3da4178ac083919ced65a208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcomment.sty \
texlive-pdfcomment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-luatex85.sty \
tex-marginnote.sty \
tex-refcount.sty \
tex-soulpos.sty \
tex-xkeyval.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
