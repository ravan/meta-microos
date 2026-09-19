SUMMARY = "LZMA stream encoding/decoding library from 7-Zip"
DESCRIPTION = "Library for encoding/decoding LZMA streams, using the 7-Zip library \
implementation."
LICENSE = "LGPL-2.1-only"

PV = "26.03"

RPM_NAME = "liblzmasdk26-26.03-1.1.aarch64.rpm"
RPM_HASH = "9dacdcc370134e3074563fc32c2ca85c698aca9ad34d05e86c13ec82f00f0100ddd18ce9e86e959fbd873673d5c86648e6aaae0bfd5e9c83516d959be767fc92"

RPROVIDES:${PN} += "liblzmasdk.so.26 \
liblzmasdk26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
