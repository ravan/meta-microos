SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "libwiretap16-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "ddc4d0e402c174031ee67c4c191c981d1a677a7885dbee2340dcb93ca920cf90d5d9b1b6aa375a2655d4444ee894defce02f65a757f3bf3b516d2ff0f56c88ae"

RPROVIDES:${PN} += "libwiretap.so.16 \
libwiretap16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblz4.so.1 \
libwsutil.so.17 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
