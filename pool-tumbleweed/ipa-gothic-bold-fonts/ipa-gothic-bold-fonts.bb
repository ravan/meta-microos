SUMMARY = "Bold Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-bold-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "fbe8d11cd49fea09300cf7e11b378158ee7fefdcee5cddf027e5ed217a9f7e2c8c0e30eb1745a701a6ed684c4a992c3ba726123cc53b1cf5e65ee2ff94e88c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic-Bold \
ipa-gothic-bold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
