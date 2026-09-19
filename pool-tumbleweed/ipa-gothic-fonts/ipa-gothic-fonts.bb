SUMMARY = "'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Gothic' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-gothic-fonts-003.03-8.23.noarch.rpm"
RPM_HASH = "e046a1b002177feecff5f4ef98d185e9729a2fccb21adf44c7609b4bf2add16ef78da508d15c44a70da90d23485943207a7b42a55e645775e1ba55bff0773704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic \
ipa-gothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
