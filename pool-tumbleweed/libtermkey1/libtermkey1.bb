SUMMARY = "Library for processing of keyboard entry from terminal-based programs"
DESCRIPTION = "This library allows easy processing of keyboard entry from terminal-based \
programs. It handles all the necessary logic to recognise special keys, UTF-8 \
combining, and so on, with a simple interface."
LICENSE = "MIT"

PV = "0.22"

RPM_NAME = "libtermkey1-0.22-3.9.aarch64.rpm"
RPM_HASH = "1d2717e5a13fb789030f03b0059817cc71597de17b7207c5365ce1b84d8da4f2b5f76c2febdacd23dd63db1d0c462ce718e1e8fff250bd193e1ab1ea897fd515"

RPROVIDES:${PN} += "libtermkey.so.1 \
libtermkey1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunibilium.so.4"

inherit rpm
