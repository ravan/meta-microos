SUMMARY = "URW Antiqua condensed font, for use with TeX"
DESCRIPTION = "The package contains a copy of the Type 1 font 'URW Antiqua \
2051 Regular Condensed' released under the GPL by URW, with \
supporting files for use with (La)TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.001.003svn24266"

RPM_NAME = "texlive-antiqua-2026.226.001.003svn24266-61.2.noarch.rpm"
RPM_HASH = "e1fd7123406d09a64e7872791701e56a0f90aca8db0dc67c3ea197fab9ee85a29530c8023db2cdb8380fb4e92624fa6f9c37a596f175793aa4f9685377035211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1uaq.fd \
tex-t1uaq.fd \
tex-ts1uaq.fd \
tex-uaq.map \
tex-uaqr7tc.tfm \
tex-uaqr7tc.vf \
tex-uaqr8ac.tfm \
tex-uaqr8cc.tfm \
tex-uaqr8cc.vf \
tex-uaqr8rc.tfm \
tex-uaqr8tc.tfm \
tex-uaqr8tc.vf \
tex-uaqrc7tc.tfm \
tex-uaqrc7tc.vf \
tex-uaqrc8tc.tfm \
tex-uaqrc8tc.vf \
tex-uaqro7tc.tfm \
tex-uaqro7tc.vf \
tex-uaqro8cc.tfm \
tex-uaqro8cc.vf \
tex-uaqro8rc.tfm \
tex-uaqro8tc.tfm \
tex-uaqro8tc.vf \
texlive-antiqua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-antiqua-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
