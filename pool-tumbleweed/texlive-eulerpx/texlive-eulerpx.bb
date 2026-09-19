SUMMARY = "A modern interface for the Euler math fonts"
DESCRIPTION = "This package provides the 'eulerpx' font, which started as a \
hybrid of multiple other font packages, notably eulervm and \
newpxmath. This package was put together with the intent to use \
it with the Palatino and Optima fonts, but it may work with \
other combinations, too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn63967"

RPM_NAME = "texlive-eulerpx-2026.226.1.0svn63967-59.2.noarch.rpm"
RPM_HASH = "020f47a1263805521cc5a772f02df77780b0e80a617253c5606f2193d50960a72b88f8556e048ca14b7f270358aa17b0ead559b85ecf57a622573f5e227ba12d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eulerpx.sty \
texlive-eulerpx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-newpxmath.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
