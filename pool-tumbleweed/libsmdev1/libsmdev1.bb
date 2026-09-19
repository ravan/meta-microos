SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmdev1-20260902-1.1.aarch64.rpm"
RPM_HASH = "02aff586ccf539bafe0467c58593a73886792dcffb301c06209c1db1945ba87d59365f6de304bc796bb5311b0aa7162aa096675a821ac5adf1947fcc01b7949a"

RPROVIDES:${PN} += "libsmdev.so.1 \
libsmdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
