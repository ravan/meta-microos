SUMMARY = "A Greek font, from one such by Baskerville"
DESCRIPTION = "The font is a digital implementation of Baskerville's classic \
Greek font, provided by the Greek Font Society. The font covers \
Greek only, and LaTeX support provides for the use of LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfsbaskerville-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "3fa57446c44e5a730d92eeea2de56a96f8a548954de4b86ccf83afe4e52fca7052833a9780d40df05d883cd60080284cad1e478970549b970e358ca10689b478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsbaskerville.map \
tex-gfsbaskerville.sty \
tex-ggfsbaskervillerg6a.tfm \
tex-ggfsbaskervillerg6a.vf \
tex-ggfsbaskervillerg6r.tfm \
tex-gpgfsbaskerville.enc \
tex-lgrgfsbaskerville.fd \
texlive-gfsbaskerville"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsbaskerville-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
