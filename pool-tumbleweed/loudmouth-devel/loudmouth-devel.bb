SUMMARY = "Jabber Client Library Written in C"
DESCRIPTION = "Loudmouth is a lightweight and easy-to-use C library for programming \
with the Jabber protocol. It's designed to be easy to get started with \
and yet extensible to let you do anything the Jabber protocol allows."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "loudmouth-devel-1.5.4-1.18.aarch64.rpm"
RPM_HASH = "1b9d5bcb52ea8d8c96bbd1b2d828df2edf5dcd6c49b53b08a2798de74d4e4897ee37d919a11cb87825475fd513be30900c2cbf153216a597a982d4db33fed0d0"

RPROVIDES:${PN} += "loudmouth-devel \
pkgconfig-loudmouth-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libloudmouth-1-0 \
pkgconfig-glib-2.0"

inherit rpm
