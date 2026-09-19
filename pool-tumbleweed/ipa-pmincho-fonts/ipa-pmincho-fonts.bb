SUMMARY = "'Proportional Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Proportional Mincho' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-pmincho-fonts-003.03-8.23.noarch.rpm"
RPM_HASH = "8f18d23332b850bcba7779e2047c313eae32fa5ebd46d07bdcaff22583d5431a93efe95bbbb96e0c3fc85572f28274345861a11d19033cf4682780123b7e3bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPMincho \
ipa-pmincho-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
