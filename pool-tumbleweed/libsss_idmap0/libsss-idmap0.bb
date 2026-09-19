SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_idmap0-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "b1b72406edbb77de5681a50dbc40a2418c78a60a350c4d91382912ed9d25d3414cb5a1da1c19e8b14a079329a0123131f27928343f850d6e780fb0f545052b9a"

RPROVIDES:${PN} += "libsss-idmap.so.0 \
libsss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
