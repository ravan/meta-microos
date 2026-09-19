SUMMARY = "Source specials for PDF output"
DESCRIPTION = "VPE is a system to make the equivalent of 'source special' \
marks in a PDF file. Clicking on a mark will activate an \
editor, pointing at the source line that produced the text that \
was marked. The system comprises a perl file (vpe.pl) and a \
LaTeX package (vpe.sty); it will work with PDF files generated \
via LaTeX/dvips, pdfTeX (version 0.14 or better), and \
LaTeX/VTeX. Using the LaTeX/dvips or pdfLaTeX routes, the \
(pdf)TeX processor should be run with shell escapes enabled."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn26039"

RPM_NAME = "texlive-vpe-2026.226.0.0.2svn26039-60.2.noarch.rpm"
RPM_HASH = "8d888c3a1a592247c8e92a8a8f075fe1c678ebcddad7be52de00c3ef3dcab01260cb582d1f4061e0b04a549355f98d692e834cb2b0e735efc77f2ef6befa37fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vpe.sty \
texlive-vpe"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-Getopt--Long \
perl-strict \
sed \
tex-color.sty \
tex-keyval.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-vpe-bin"

inherit rpm
