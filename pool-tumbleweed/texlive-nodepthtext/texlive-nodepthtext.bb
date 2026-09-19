SUMMARY = "Change small texts to remove the depth of the letters"
DESCRIPTION = "Modify small texts in order to remove depth of letters (for \
small texts), with automatic raising/scaling."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73069"

RPM_NAME = "texlive-nodepthtext-2026.226.0.0.1.0svn73069-61.2.noarch.rpm"
RPM_HASH = "eade9ed5c2c2107687e90d98c448e2f4f73c7a2d65921abf9562de47c3e073f370889d68c774c756eb94b96a1cccac09473a66896c08b8388b00bfd102d8b89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nodepthtext.sty \
texlive-nodepthtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
