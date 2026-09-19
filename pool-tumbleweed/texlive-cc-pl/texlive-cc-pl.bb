SUMMARY = "Polish extension of Computer Concrete fonts"
DESCRIPTION = "These Metafont sources rely on the availability of the Metafont \
'Polish' fonts and of the Metafont sources of the original \
Concrete fonts. Adobe Type 1 versions of the fonts are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-2026.226.1.02.3svn58602-59.2.noarch.rpm"
RPM_HASH = "cb2cffb5ba5bbe45bd0f18b19976bba055cc844da72c5bf8d1ad1505378db773feed7cf18bc24a145a28b9b4f8a25f4b5e08a60c73c81821e14253555db5f19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccpl.map \
tex-pccsc10.tfm \
tex-pcmi10.tfm \
tex-pcr10.tfm \
tex-pcr5.tfm \
tex-pcr6.tfm \
tex-pcr7.tfm \
tex-pcr8.tfm \
tex-pcr9.tfm \
tex-pcsl10.tfm \
tex-pcslc9.tfm \
tex-pcti10.tfm \
texlive-cc-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cc-pl-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
