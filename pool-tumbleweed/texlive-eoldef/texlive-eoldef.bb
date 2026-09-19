SUMMARY = "Define commands which absorb the whole source line as arguments"
DESCRIPTION = "This macro allows you to define commands that take the entire \
source line as arguments. Usage: \\eoldef <control sequence> \
<parameter text> { <replacement text>} defines a control \
sequence that is delimited by the end-of-line in addition to \
the specified parameter text. For instance, \\eoldef\\test#1:#2{} \
and \\test abc:def will give #1 = abc, #2 = def. \\eolgdef is the \
\\global variant to \\eoldef. Like \\verb|...|, \\eoldef'd commands \
may generally not be used as part of another command's argument \
as it changes catcodes. However, if you must use it in \
environments where catcodes are frozen, you may follow the \
command with a braced argument, eg. \\test{#1:#2} using the \
previous example. This package may be used in plain TeX or \
LaTeX by \\input{eoldef}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76050"

RPM_NAME = "texlive-eoldef-2026.226.1.1svn76050-61.4.noarch.rpm"
RPM_HASH = "8325c1ebc17c56f6671fdfccf61dfb4d66d19f9e889768a93ba6a7312cdf5fe24ecc999434ce764247624080bb0286abf49fa89b2beae2f6fadfb5166a0e56a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eoldef.sty \
tex-eoldef.tex \
texlive-eoldef"

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
