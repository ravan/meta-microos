SUMMARY = "Bluez tools that upstream considers obsolete"
DESCRIPTION = "This package contains tools from the bluez package that are only built \
if the '--enable-deprecated' switch is used. These are considered obsolete \
by the upstream developers and might contain serious issues, even security \
bugs. Use at your own risk. \
 \
Note that this package will go away before end of 2020, change your code \
to use the modern tools instead."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-deprecated-5.82-2.4.aarch64.rpm"
RPM_HASH = "921b621f4a5fe3c1253fc95777b0fe7d9dda8ea5b04fa19b8de908bd7eb7709ce9e3679e5f2aaab5b43236e76ddaafa9e20c2a94d2f00f89948a72acf511bc24"

RPROVIDES:${PN} += "bluez-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreadline.so.8 \
libudev.so.1"

inherit rpm
