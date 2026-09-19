SUMMARY = "A socket daemon to multiplex connections from and to iOS devices"
DESCRIPTION = "This package provides the usbmuxd daemon for software to use through the \
libusbmuxd library to talk with iPhone/iPod Touch devices. \
 \
Usbmux is an encapsulation protocol (think IP, ATM, PPP) that allows \
multiplexing several conversations onto a single pair of wires."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.1.1+git72.3ded00c"

RPM_NAME = "usbmuxd-1.1.1+git72.3ded00c-1.4.aarch64.rpm"
RPM_HASH = "82b018e09a5da64f333bce3c55091cf29a94e7d345e9cee6e0193b8038f99d3fb59138fca6f255f0d3a455fde9f59715b20371fd576d6ba45705828f7fd748d4"

RPROVIDES:${PN} += "group-usbmux \
usbmuxd \
user-usbmux"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libusb-1.0.so.0 \
systemd \
sysuser-shadow"

inherit rpm
