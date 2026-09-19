SUMMARY = "French version of 'graphics in LaTeX'"
DESCRIPTION = "This is the French translation of epslatex, and describes how \
to use imported graphics in LaTeX(2e) documents."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-epslatex-fr-2026.226.svn19440-61.4.noarch.rpm"
RPM_HASH = "a7e1e154886f51b9992db91be394f6a4fcf6226faac0ad4c0e2beb0f66df4b0d2348f726ee955040f50966b4d4af31ddc618bc8b079905223f163cec83114470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epslatex-fr"

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
