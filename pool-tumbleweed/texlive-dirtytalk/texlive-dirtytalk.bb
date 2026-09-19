SUMMARY = "A package to typeset quotations easier"
DESCRIPTION = "The package provides a macro to typeset quotations, using the \
command \\say{stuff}. The quotation mark glyphs are inserted by \
the macro; nested quotations are detected."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-2026.226.1.0svn20520-59.2.noarch.rpm"
RPM_HASH = "f54599fb136c31dbce78b68726f5216e9ea7014571eb846d8ed575b068b18504f9ef7cff465eac5b91c9087a0264f5feba95cedd5634938534fcf2399a706527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dirtytalk.sty \
texlive-dirtytalk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
