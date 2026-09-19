SUMMARY = "Scalable 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Gothic' Japanese TrueType font made by IPA (Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "004.01"

RPM_NAME = "ipa-ex-gothic-fonts-004.01-1.18.noarch.rpm"
RPM_HASH = "23d2ca1edfae1c56be3f8b42d65db6856f77a05550ea32e69b140cefd43c669b3026c2f9607aaa432bcd58aeda865ec11ec3a93f5e3e501dfab58d4bfd656b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipa-ex-gothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
