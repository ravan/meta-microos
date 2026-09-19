SUMMARY = "A Greek and Latin font"
DESCRIPTION = "Epigrafica is forked from the development of the MgOpen font \
Cosmetica, which is a similar design to Optima and includes \
Greek. Development has been supported by the Laboratory of \
Digital Typography and Mathematical Software, of the Department \
of Mathematics of the University of the Aegean, Greece."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn17210"

RPM_NAME = "texlive-epigrafica-2026.226.1.01svn17210-61.4.noarch.rpm"
RPM_HASH = "b64eac89020a0e95fbbc36e9e7d9777045924c2566f42eb37d9bd8e07fb8c75e99a9febe5f73c0f7f76939f2d4c8122f163cd9f1b75b7c77a30540c604b2f257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigrafica.map \
tex-epigrafica.sty \
tex-epigraficab8a.tfm \
tex-epigraficab8r.tfm \
tex-epigraficab8r.vf \
tex-epigraficabi8a.tfm \
tex-epigraficabi8r.tfm \
tex-epigraficabi8r.vf \
tex-epigraficabo8a.tfm \
tex-epigraficabo8r.tfm \
tex-epigraficabo8r.vf \
tex-epigraficac8a.tfm \
tex-epigraficac8r.tfm \
tex-epigraficac8r.vf \
tex-epigraficahb7a.tfm \
tex-epigraficahb7r.tfm \
tex-epigraficahb7r.vf \
tex-epigraficahbi7a.tfm \
tex-epigraficahbi7r.tfm \
tex-epigraficahbi7r.vf \
tex-epigraficahbo7a.tfm \
tex-epigraficahbo7r.tfm \
tex-epigraficahbo7r.vf \
tex-epigraficahc7a.tfm \
tex-epigraficahc7r.tfm \
tex-epigraficahc7r.vf \
tex-epigraficahellenic.enc \
tex-epigraficahi7a.tfm \
tex-epigraficahi7r.tfm \
tex-epigraficahi7r.vf \
tex-epigraficahn7r.tfm \
tex-epigraficahn7r.vf \
tex-epigraficaho7a.tfm \
tex-epigraficaho7r.tfm \
tex-epigraficaho7r.vf \
tex-epigraficai8a.tfm \
tex-epigraficai8r.tfm \
tex-epigraficai8r.vf \
tex-epigrafican8a.tfm \
tex-epigrafican8r.tfm \
tex-epigrafican8r.vf \
tex-epigraficao8a.tfm \
tex-epigraficao8r.tfm \
tex-epigraficao8r.vf \
tex-gepigraficahn7a.tfm \
tex-lgrepigrafica.fd \
tex-ot1epigrafica.fd \
texlive-epigrafica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pxfonts.sty \
tex-updmap.cfg \
texlive \
texlive-epigrafica-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
