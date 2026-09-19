SUMMARY = "Collection of fancy features for GLib and Gtk+"
DESCRIPTION = "This package provides the dazzle-list-counters binary."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "dazzle-list-counters-3.44.0-2.7.aarch64.rpm"
RPM_HASH = "f6c61b79fa76f900f804252becf764a8212a3c0c05d2ae0fa009353416cff09c953a4970b9c7f13c676e0cf8c5aedddfafcceee2d97a707e1289bdb97f1458a4"

RPROVIDES:${PN} += "dazzle-list-counters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdazzle-1.0.so.0 \
libglib-2.0.so.0"

inherit rpm
