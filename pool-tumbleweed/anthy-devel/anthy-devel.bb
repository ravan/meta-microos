SUMMARY = "Header files for the Anthy Kana–Kanji conversion engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "9100h"

RPM_NAME = "anthy-devel-9100h-42.12.aarch64.rpm"
RPM_HASH = "c7bee08d55554cae9d9718ef7a00c9fac6b4f561a9bc74296406aa333dfc2c1ca1666a74be03f2b44cc09517f05056fb23ce57200b1a68854c7bf02dc020d397"

RPROVIDES:${PN} += "anthy-devel \
pkgconfig-anthy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanthy0"

inherit rpm
