SUMMARY = "Bold Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-bold-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "767d5c0b6f384d23f17f291c3fdba2b16f3f1c05ab061b5d1375fde50f4c08a3aae8eade801dfaefc46863c0ff6e9b38375e1478b8c672beacedb6070510e555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic-Bold \
ipa-pgothic-bold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
