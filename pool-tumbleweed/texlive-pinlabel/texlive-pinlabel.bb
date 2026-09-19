SUMMARY = "A TeX labelling package"
DESCRIPTION = "Pinlabel is a labelling package for attaching perfectly \
formatted TeX labels to figures and diagrams in both eps and \
pdf formats. It is suitable both for labelling a new diagram \
and for relabelling an existing diagram. The package uses \
coordinates derived from GhostView (or gv) and labels are \
placed with automatic and consistent spacing relative to the \
object labelled."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn24769"

RPM_NAME = "texlive-pinlabel-2026.226.1.2svn24769-58.2.noarch.rpm"
RPM_HASH = "d1b47d3d3dfc33241adf437e63386775439d4e495ea296e50ef896bd994bdc8140eafca40614c64edf7b20ebc91949a82e5228e59f0380fb68c06967013e374b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pinlabel.sty \
texlive-pinlabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
