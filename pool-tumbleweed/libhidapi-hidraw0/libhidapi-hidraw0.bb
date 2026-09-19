SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-hidraw0-0.14.0-1.11.aarch64.rpm"
RPM_HASH = "e294906be7d1dc3fd0f81868ff3fc5061e531363a7597923419a36e83c54ef88d53acf369361d1d41bdb2aeed8af61d30defdae22776ec6ab077aaaf35a88578"

RPROVIDES:${PN} += "libhidapi-hidraw.so.0 \
libhidapi-hidraw0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
