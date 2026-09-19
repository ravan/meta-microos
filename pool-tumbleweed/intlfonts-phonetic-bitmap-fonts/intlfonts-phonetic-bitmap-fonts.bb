SUMMARY = "IPA font for the X Window System"
DESCRIPTION = "The International Phonetic Alphabet font for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-phonetic-bitmap-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "3b4780f790224b49728a810d321c7fa4b3a14d9b47eb314947198e23f448a27070c77cced982802c6c41128fb5fcefaaa252fc2278fdd9d19b56629e76e646ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntphon \
intlfonts-phonetic-bitmap-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
