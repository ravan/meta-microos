SUMMARY = "Common Access Card (CAC) emulation"
DESCRIPTION = "This emulator is designed to provide emulation of actual smart cards to a \
virtual card reader running in a guest virtual machine. The emulated smart \
cards can be representations of real smart cards, where the necessary functions \
such as signing, card removal/insertion, etc. are mapped to real, physical \
cards which are shared with the client machine the emulator is running on, or \
the cards could be pure software constructs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.2"

RPM_NAME = "libcacard0-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "edbdc3fa498c0aa57589afee54341b5362473ad5b5059ffda067db7f591b748802d4bdb293735a5d7e6fd3028317f54a92589d1694b78e9bc238a5a0d370407b"

RPROVIDES:${PN} += "libcacard.so.0 \
libcacard0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnspr4.so \
libnss3.so"

inherit rpm
