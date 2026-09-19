SUMMARY = "Draw continuum, emission and absorption spectra with PSTricks"
DESCRIPTION = "The package is a PSTricks extension, based on a NASA lines \
database. It allows you to draw continuum, emission and \
absorption spectra. A Total of 16 880 visible lines from 99 \
elements can be displayed. The package requires the xkeyval \
package for decoding its arguments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-2026.226.0.0.91svn15878-60.4.noarch.rpm"
RPM_HASH = "35c18241c2e0c18dc8e0c9197b4322d5c028a397f1ce1b7d61dbec279358f62eb87b1fab62528a46edda785fe03bd6c40c440ee40235859a457e18e3e69aa71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spectra.sty \
tex-pst-spectra.tex \
texlive-pst-spectra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pstricks.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
