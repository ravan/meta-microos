SUMMARY = "LaTeX package for typesetting extensive games"
DESCRIPTION = "The style is intended to have enough features to draw any \
extensive game with relative ease. The facilities of PSTricks \
are used for graphics. (An older version of the package, which \
uses the LaTeX picture environment rather than PSTricks and \
consequently has many fewer features is available on the \
package home page.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-egameps-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "2e49b0dd272dcb19f354aa5897efad08190d665d169676866f056e7baca74a322e13aff5cea7bc16854e405c8b376024b82cf3c254d057fee41cb33f879243d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egameps.sty \
texlive-egameps"

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
