SUMMARY = "Abbreviations for typesetting (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It helps you to handle abbreviations and creates a list of \
those (pre-defined) abbreviations that have actually been used \
in the document"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-juraabbrev-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "657f9180d40813081165a0c145b8be2f9800cd73cf060e1fcb85a0bdbd63f3e0f67c281d9313f4db0133c86161ab2c8d407cc67c8fca2dc47773ad312a21395f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-juraabbrev.sty \
texlive-juraabbrev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
