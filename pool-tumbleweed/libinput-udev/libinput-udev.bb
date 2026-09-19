SUMMARY = "Input device and event processing library integration into udev"
DESCRIPTION = "The libinput udev helper rule will set the LIBINPUT_DEVICE_GROUP \
variable for event devices. Device groups are a labelling system to \
allow callers to identify which libinput devices are part of the same \
physical device."
LICENSE = "MIT"

PV = "1.31.3"

RPM_NAME = "libinput-udev-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "b4f36307105a93be1a6846708c4b804cc17fd50946ababac3a5cff693f82a95a0b9363774378fb4db7e67bd64dee73354a253450983dfc210b5edcdfefa0a4eb"

RPROVIDES:${PN} += "libinput-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
