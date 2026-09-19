SUMMARY = "Macros for continuous sets and neural networks in the context of cyber-physical systems"
DESCRIPTION = "This LaTeX package has been designed to assist in the \
representation and manipulation of continuous sets, operations, \
neural networks, and color schemes tailored for use in the \
context of cyber-physical systems. It provides a comprehensive \
set of macros that streamline the process of documenting \
complex mathematical objects and operations."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76540"

RPM_NAME = "texlive-cora-macs-2026.226.svn76540-61.2.noarch.rpm"
RPM_HASH = "bf5cbc92343bf56f0d5e74c114d1aa551c10c5b7bf8d582f81b2c68e3334e443556f575a8c09ce494565d7d5577ee56acbfde1112799a85480e1ba2fc582064e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cora-macs.sty \
texlive-cora-macs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-graphics.sty \
tex-keyval.sty \
tex-mathtools.sty \
tex-pgfplots.sty \
tex-tikzscale.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
