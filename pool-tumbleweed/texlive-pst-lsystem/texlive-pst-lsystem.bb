SUMMARY = "Create images based on a L-system"
DESCRIPTION = "pst-lsystem is a PSTricks based package for creating images \
based on a L-system. A L-system (Lindenmayer system) is a set \
of rules which can be used to model the morphology of a variety \
of organisms or fractals like the Kochflake or Hilbert curve."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-2026.226.0.0.02svn49556-59.2.noarch.rpm"
RPM_HASH = "a0fc6951547b67f0ce4add7d41dcf5890d65bc73b2adc5de6be28a83c779e7d846e4d3d2cb03bf1cb008cd396fbcef9bf04054a9de79dce7aec38bb88308f26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-lsystem.sty \
tex-pst-lsystem.tex \
texlive-pst-lsystem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
