SUMMARY = "A ticking digital clock package for PDF output"
DESCRIPTION = "A ticking digital clock package to be used in Pdf-LaTeX \
documents, for example in presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.2.5svn33043"

RPM_NAME = "texlive-tdclock-2026.227.2.5svn33043-62.2.noarch.rpm"
RPM_HASH = "c2b0c4ab90b1dae4ebf2d41870aa4773e37ebfaaa5f7d82d285d3812e58cc72004b6a69855c73b16a3e420551c5fef5a57632d215577c1d1cb171ba29f0912a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tdclock.sty \
texlive-tdclock"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
