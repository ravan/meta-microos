SUMMARY = "Severed fonts for texlive-xypic"
DESCRIPTION = "The  separated fonts package for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.8.9svn78101"

RPM_NAME = "texlive-xypic-fonts-2026.226.3.8.9svn78101-59.4.noarch.rpm"
RPM_HASH = "72ced44320bef8f37ecb026c8796063235e0c198c6eacc56e794f78e7b39084474f0bce390645fa6b5c3f8578baacad4b8a28b850d28b73a6645574540777d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-xyatip \
font-xybsql \
font-xybtip \
font-xycirc \
font-xycmat \
font-xycmbt \
font-xydash \
font-xyeuat \
font-xyeubt \
font-xyluat \
font-xylubt \
texlive-xypic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
