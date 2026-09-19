SUMMARY = "Command-line utilties to manipulate IEEE1394 devices"
DESCRIPTION = "Command-line utilities to inspect and send IEEE 1394 isochronous \
packets, and to test the basic functionality of raw1394."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-tools-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "471ea74ae990d9a92064ef5067fc5b723fba67d6ad69466e0fd093d0c92ab90eeb1daeb4f6b2b1d65734116575288ca0579221cff27a04ce1ff17556fd55be48"

RPROVIDES:${PN} += "libraw1394 \
libraw1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
