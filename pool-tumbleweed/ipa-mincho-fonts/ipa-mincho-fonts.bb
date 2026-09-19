SUMMARY = "'Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Mincho' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-mincho-fonts-003.03-8.23.noarch.rpm"
RPM_HASH = "47e6141c28bb836cd53982cbd865897af132681d3e0182c6789caf87243e9160c7172c1b563eb35e610b6198196403977fe30d77ceb6e42c0d2af2a9b95f6cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAMincho \
ipa-mincho-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
