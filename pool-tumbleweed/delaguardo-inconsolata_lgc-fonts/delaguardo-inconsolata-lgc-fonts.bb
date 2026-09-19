SUMMARY = "Inconsolata font with Cyrillic characters"
DESCRIPTION = "Inconsolata is one of the most suitable font for programmers created by Raph \
Levien. Since the original Inconsolata does not contain Cyrillic alphabet, \
it was slightly inconvenient for not a few programmers from Russia. \
 \
Inconsolata LGC is a modified version of Inconsolata with added the Cyrillic \
alphabet which directly descends from Inconsolata Hellenic supporting modern \
Greek."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "delaguardo-inconsolata_lgc-fonts-1.1.0-5.25.noarch.rpm"
RPM_HASH = "3395cd55379d178474009e7b013e6a39b1410ee6a27b33fecbd1402c353a5a3189252338db008104ab48b8646d16159f0cdf9c534cec2df021666e1bd6b4fc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "delaguardo-inconsolata-lgc-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
