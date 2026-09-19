SUMMARY = "Produce a table of contents for each chapter, part or section"
DESCRIPTION = "The minitoc package allows you to add mini-tables-of-contents \
(minitocs) at the beginning of every chapter, part or section. \
There is also provision for mini-lists of figures and of \
tables. At the part level, they are parttocs, partlofs and \
partlots. If the type of document does not use chapters, the \
basic provision is section level secttocs, sectlofs and \
sectlots. The package has provision for language-specific \
configuration of its own 'fixed names', using .mld files \
(analagous to babel .ldf files that do that job for LaTeX's own \
fixed names)."
LICENSE = "LPPL-1.0"

PV = "2026.226.62svn77682"

RPM_NAME = "texlive-minitoc-2026.226.62svn77682-61.2.noarch.rpm"
RPM_HASH = "328914b38928fc5392e3c802dc08ee1d31d5af31be2afb3f47be818828e14dd6979e27915612bcced397d33c003c15bce03634591971f687cdc318bc70b4b18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minitoc.sty \
tex-mtcmess.sty \
tex-mtcoff.sty \
tex-mtcpatchmem.sty \
texlive-minitoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-flafter.sty \
tex-notoccite.sty \
tex-placeins.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
