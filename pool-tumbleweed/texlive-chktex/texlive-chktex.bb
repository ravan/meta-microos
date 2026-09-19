SUMMARY = "Check for errors in LaTeX documents"
DESCRIPTION = "The program reports typographic and other errors in LaTeX \
documents. Filters are also provided for checking the LaTeX \
parts of CWEB documents."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7.10svn78219"

RPM_NAME = "texlive-chktex-2026.226.1.7.10svn78219-60.2.noarch.rpm"
RPM_HASH = "2137d37f049ece111f0de7f597e07f151b6ada5a783da217a8ab33821badd2cb2b1e0af0e8be1617582995fc7f30e200589238460832e092b409d90ac48bf737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chktex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-chktex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
