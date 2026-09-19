SUMMARY = "Chicago-style footnote formatting"
DESCRIPTION = "A very short snippet. Will set the footnotes to be conformant \
with the Chicago style, so the footnotes at the bottom of the \
page are now marked with a full-sized number, rather than with \
a superscript number."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn57312"

RPM_NAME = "texlive-chifoot-2026.226.1.0svn57312-60.2.noarch.rpm"
RPM_HASH = "6d0f427c1272b1b6429b6ffeed465ce92652e7d4add1b024d9fdf9a3267dba1061216e262294cb2d607f2a3df0bce1138644c2724827ab5e2867a3c0f7a89aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chifoot.sty \
texlive-chifoot"

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
