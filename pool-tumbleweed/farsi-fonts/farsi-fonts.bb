SUMMARY = "A Collection of Free Persian OpenType Fonts"
DESCRIPTION = "This package contains collection of free Persian OpenType fonts."
LICENSE = "GPL-2.0+"

PV = "0.4"

RPM_NAME = "farsi-fonts-0.4-192.25.noarch.rpm"
RPM_HASH = "b316ef926ca11fefeb0bec632f0804d45c91f27f1ed2fa48c0a8748b8d812f550b4c3886cc6ee1675ad5645a878d4b1ed7ae2190d5145d5ea13277859502a49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "farsi-fonts \
farsifonts \
locale-fa \
scalable-font-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
