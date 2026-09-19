SUMMARY = "More gobble macros for PlainTeX and LaTeX"
DESCRIPTION = "The LaTeX package gobble includes several gobble macros not \
included in the LaTeX kernel. These macros remove a number of \
arguments after them, a feature regulary used inside other \
macros. This includes gobble macros for optional arguments. The \
LaTeX package gobble-user provides these macros at the user \
level, i.e. using names without @ so that these can be used \
without \\makeatletter and \\makeatother. The same macros are \
provided inside .tex files for use with plain-TeX or other TeX \
formats. However, the gobble macros for optional macros require \
\\@ifnextchar to be defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn64967"

RPM_NAME = "texlive-gobble-2026.226.0.0.2svn64967-60.4.noarch.rpm"
RPM_HASH = "1b44228df6f455a06bf15432f0ad767c29d4ab313bdd2b783663b957550c4c116b1f17a8e08f07e9f24bb99255616431f08213b587a2a9a4096abfdc995335e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gobble-user.sty \
tex-gobble-user.tex \
tex-gobble.sty \
tex-gobble.tex \
texlive-gobble"

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
