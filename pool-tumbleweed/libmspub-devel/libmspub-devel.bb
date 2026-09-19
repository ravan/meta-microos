SUMMARY = "Files for Developing with libmspub"
DESCRIPTION = "libmspub is a library for parsing the Microsoft Publisher file format structure. \
 \
This package contains the libmspub development files."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "libmspub-devel-0.1.5-2.3.aarch64.rpm"
RPM_HASH = "ced0147cbab2d631a810e505e58c4b3f1f744860cc8b6b5ddf909f7dd506807bd8625ccc2828b1552ee505f98f338e8581d0cbe03c19203f3c20da96c2c22d19"

RPROVIDES:${PN} += "libmspub-devel \
pkgconfig-libmspub-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmspub-0-1-1 \
pkgconfig-icu-i18n \
pkgconfig-librevenge-0.0 \
pkgconfig-zlib"

inherit rpm
