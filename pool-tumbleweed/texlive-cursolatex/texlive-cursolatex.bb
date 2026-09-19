SUMMARY = "A LaTeX tutorial"
DESCRIPTION = "The tutorial is presented as a set of slides (in Portuguese)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn24139"

RPM_NAME = "texlive-cursolatex-2026.226.svn24139-61.2.noarch.rpm"
RPM_HASH = "71295516a9d112f8b4a09245bede39616f1cffbf04e7c420d146c1d07dbdd7617bf1f41add52b2aaf75c65ffaf2bbfd305526a723eefcc9afa2412621b2a261f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cursolatex"

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
