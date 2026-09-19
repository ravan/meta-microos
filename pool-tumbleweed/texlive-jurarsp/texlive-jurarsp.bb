SUMMARY = "Citations of judgements and official documents in (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It (ab)uses BibTeX for citations of judgements and \
official documents. For this purpose, a special BibTeX-style is \
provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-2026.226.0.0.52svn15878-63.2.noarch.rpm"
RPM_HASH = "0725f1fdb64c1b1b127252a76ed1f4a593c38e5dcbbda9877947266910c66a75ab5c5baa4edfd760848ec4066467590071903350c473536fefd876acd261c0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jurarsp.cfg \
tex-jurarsp.sty \
texlive-jurarsp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
