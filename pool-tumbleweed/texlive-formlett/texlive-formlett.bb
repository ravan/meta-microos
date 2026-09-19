SUMMARY = "Letters to multiple recipients"
DESCRIPTION = "A package for multiple letters from the same basic source; the \
package offers parametrisation of the letters actually sent."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn21480"

RPM_NAME = "texlive-formlett-2026.226.2.3svn21480-60.2.noarch.rpm"
RPM_HASH = "cbd97e5b75debdf22b6982e00417cc2a4d08dcc2c8dbb1dd536fc13a3530d3eb0e05e2d0ac8cad85b33f32560ebdc75d58a170469b6c1ef0da68493b58a670b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formlett.sty \
texlive-formlett"

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
