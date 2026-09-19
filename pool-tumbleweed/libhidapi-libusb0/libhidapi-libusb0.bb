SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-libusb0-0.14.0-1.11.aarch64.rpm"
RPM_HASH = "39ddff9590545fad857488f8c870b272c09d9cc957816881be6b7245ca60c6f0672c90a394540a81b81d6a98e05c25f125ddbbee0f201179c9184dbf2c04a16a"

RPROVIDES:${PN} += "libhidapi-libusb.so.0 \
libhidapi-libusb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
