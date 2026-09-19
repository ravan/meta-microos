SUMMARY = "Severed fonts for texlive-gregoriotex"
DESCRIPTION = "The  separated fonts package for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.1.0svn74348"

RPM_NAME = "texlive-gregoriotex-fonts-2026.226.6.1.0svn74348-60.4.noarch.rpm"
RPM_HASH = "969adf06c9d2b78decce4d713c5e987329de54fda125b89918a97eb13511dd7470bde7009a81876a57857a4b88883e908cedbbd337095640d57ceec8610a40f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-granapadano \
font-granapadano-hole \
font-granapadano-hollow \
font-granapadano-op \
font-granapadano-op-hole \
font-granapadano-op-hollow \
font-greciliae \
font-greciliae-hole \
font-greciliae-hollow \
font-greciliae-op \
font-greciliae-op-hole \
font-greciliae-op-hollow \
font-greextra \
font-gregall \
font-gregorio \
font-gregorio-hole \
font-gregorio-hollow \
font-gregorio-op \
font-gregorio-op-hole \
font-gregorio-op-hollow \
font-grelaon \
font-gresgmodern \
texlive-gregoriotex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
