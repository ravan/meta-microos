SUMMARY = "Development files for seagull"
DESCRIPTION = "Development files for seagull."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "seagull-devel-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "b6156e669c8ef411ba795ad7bda8c56101b469210247bd7a1c792e460cbe0616f6751ccfc73179344879aab0f406bf9d37ecad6c255699988d0263d960364916"

RPROVIDES:${PN} += "pkgconfig-seagull \
seagull-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseagull0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-sqlite3 \
typelib-1-0-Seagull-1-0"

inherit rpm
