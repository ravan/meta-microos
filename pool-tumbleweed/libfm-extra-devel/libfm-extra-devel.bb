SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra-devel-1.3.1-2.4.aarch64.rpm"
RPM_HASH = "51c478f1ada7f94c1fc0096522b3e57b32cf5355032c8dcdb179e7b29a7cc3b431e0f1d658497fba0fba114745bb1204849938174a4e46505da21827c48112c6"

RPROVIDES:${PN} += "libfm-extra-devel \
pkgconfig-libfm-extra"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-extra4 \
pkg-config \
pkgconfig-glib-2.0"

inherit rpm
