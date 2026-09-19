SUMMARY = "A reworking of ESSTIX13, adding a bold version"
DESCRIPTION = "This package reworks the mathematical calligraphic font \
ESSTIX13, adding a bold version. LaTeX support files are \
included. The new fonts may also be accessed from the most \
recent version of mathalpha. The fonts themselves are subject \
to the SIL OPEN FONT LICENSE, version 1.1."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-dutchcal-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "567e53139638a98be4cd11553a4cfed69542862a2ac9f55122bac93e3c779aa3a426db88dc83ee8a68c01ab1ad91ec5480c27fc09ed161a863bb52c256a2bfb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dutchcal-b.tfm \
tex-dutchcal-b.vf \
tex-dutchcal-r.tfm \
tex-dutchcal-r.vf \
tex-dutchcal.map \
tex-dutchcal.sty \
tex-rdutchcalb.tfm \
tex-rdutchcalr.tfm \
tex-udutchcal.fd \
texlive-dutchcal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-dutchcal-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
