SUMMARY = "Sans-math fonts for use with newtx"
DESCRIPTION = "The package provides a maths support that amounts to \
modifications of the STIX sans serif Roman and Greek letters \
with most symbols taken from newtxmath (which must of course be \
installed and its map file enabled)."
LICENSE = "OFL-1.1"

PV = "2026.226.1.056svn77682"

RPM_NAME = "texlive-newtxsf-2026.226.1.056svn77682-61.2.noarch.rpm"
RPM_HASH = "390763f6d4fbdb8e50082fbf930a863d4d4d2c598d8c54a3b4c7a00319aaefddf7ded24920170866ec236cda4da4d6ba4a8d7354cbe0b6cd60d5c3d8d4a9a801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newtxsf.map \
tex-newtxsf.sty \
tex-ntxsfbmi.tfm \
tex-ntxsfbmi.vf \
tex-ntxsfbmia.tfm \
tex-ntxsfbmia.vf \
tex-ntxsfmi.tfm \
tex-ntxsfmi.vf \
tex-ntxsfmia.tfm \
tex-ntxsfmia.vf \
tex-omlntxsfmi.fd \
tex-untxsfmia.fd \
tex-zsfmi-bol.tfm \
tex-zsfmi-reg.tfm \
tex-zsfmia-bol.tfm \
tex-zsfmia-reg.tfm \
texlive-newtxsf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-rtxbmi.tfm \
tex-rtxmi.tfm \
tex-txbmia.tfm \
tex-txbsyb.tfm \
tex-txbsyc.tfm \
tex-txmia.tfm \
tex-txsyb.tfm \
tex-txsyc.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newtxsf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
