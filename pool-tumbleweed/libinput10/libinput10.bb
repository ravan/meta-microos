SUMMARY = "Input device and event processing library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
It provides device detection, device handling, input device event \
processing and abstraction so minimize the amount of custom input \
code the user of libinput need to provide the common set of \
functionality that users expect."
LICENSE = "MIT"

PV = "1.31.3"

RPM_NAME = "libinput10-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "aa58d49a5980c1a0f8128195b5737c24880719b6493971101f1e91e31d48af7e91bd8901c94c03c88c1cca6adc6b3e87e259eb5b66d2969adec59edc7cca305f"

RPROVIDES:${PN} += "libinput.so.10 \
libinput10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libm.so.6 \
libmtdev.so.1 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
