SUMMARY = "Scalable 'Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Mincho' Japanese TrueType font made by IPA (Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "004.01"

RPM_NAME = "ipa-ex-mincho-fonts-004.01-1.18.noarch.rpm"
RPM_HASH = "424608ce072415599016b593b3f023c8a2b29fedcf482978a72989e59dabd434cdf369f712e208aa6a66d10b89dee8b72edc67878c87f6683a2ca874aca0adb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipa-ex-mincho-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
