SUMMARY = "Page layout macros based on PSTricks packages"
DESCRIPTION = "The package provides a means of creating elaborate \
('pseudo-tabular') layouts of material, typically to be \
overlaid on an included graphic. The package requires a recent \
version of the package pst-node and some other pstricks-related \
material."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-2026.226.0.0.95svn29803-59.2.noarch.rpm"
RPM_HASH = "0e43af23ddd5666e425c73988253682af20ccf2a8f9e7b40bfaaa76c2ea9e6db62b13195d5a61cc69e7f026536859f2bcbb2bbdcee5af614d240b5804cca5581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-layout.sty \
texlive-pst-layout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjobx.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
