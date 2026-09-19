SUMMARY = "OpenRGB udev rules"
DESCRIPTION = "This package contains the udev rules for OpenRGB."
LICENSE = "GPL-2.0-or-later"

PV = "1.0~rc3.1+git0.g5e81e26f"

RPM_NAME = "OpenRGB-udev-rules-1.0~rc3.1+git0.g5e81e26f-1.1.noarch.rpm"
RPM_HASH = "ff208b380f95614988b2d67bd6be338e6fb8a249a9c89fb5fd2f094c1330b3a188bf0ea8341e0fed4d03529594dfc55ae396fc77a54594b778bb0b38d13c404c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenRGB-udev-rules \
group-openrgb"

RDEPENDS:${PN} += "/usr/bin/sh \
OpenRGB"

inherit rpm
