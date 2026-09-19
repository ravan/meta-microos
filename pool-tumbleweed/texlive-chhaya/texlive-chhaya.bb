SUMMARY = "Linguistic glossing in Marathi language"
DESCRIPTION = "muNbii vidyaapiitthaacyaa chaayaalekhn niymaavliis anusruun \
bhaassaavaijnyaanik chaayaaNgaaNce sNkssep purvnnaaraa \
aajnyaasNc. This package provides macros for linguistic \
glossing as per the rules given by Mumbai University."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-2026.226.0.0.4svn61719-60.2.noarch.rpm"
RPM_HASH = "9e2dd6163667b7cb6a6305db0f9c3678625417c0ad7bc41f1a29a2d024e0dc9929fb873f8748b2632d3170ce9b01b9bc2b254b40668c34a6ab90dafc07077b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chhaya.sty \
tex-sankshep.tex \
texlive-chhaya"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-glossaries.sty \
tex-iftex.sty \
tex-marathi.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
