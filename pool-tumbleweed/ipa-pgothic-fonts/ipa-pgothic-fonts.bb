SUMMARY = "'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-pgothic-fonts-003.03-8.23.noarch.rpm"
RPM_HASH = "5a2e8e93dc94d6070b1b873827cec251278f9fb7eae11c37bbcc5aef2ceb42fd75d63f32e4aacd6bf18fb7594824dba97763dce13b2a8df35c82a91bb1c75206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic \
ipa-pgothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
