SUMMARY = "Table typesetting with expl3 syntax"
DESCRIPTION = "This package offers an experimental solution for table \
typesetting. It features a completely new set of input and \
output interfaces for tables, which diversifies the methods of \
input and output and enhances readability. At the code level, \
it is written using the expl3 syntax, completely eliminating \
any reliance on traditional low-level table commands."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn76924"

RPM_NAME = "texlive-tabular2-2026.227.0.0.3svn76924-62.2.noarch.rpm"
RPM_HASH = "964643fad6266f1193e20a9fa5dac6acb59ec455c7256622897075f5082424ab23e4c113ee0dd12f4360810280c90655d2e1ad6d0ea84ef2b4a9a15aa3fb1a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabular2.sty \
texlive-tabular2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3draw.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
