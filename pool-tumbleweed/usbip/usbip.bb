SUMMARY = "The USB/IP shared USB system over IP network"
DESCRIPTION = "USB/IP protocol allows to pass USB device from server to client over the \
network. Server is a machine which provides (shares) a USB device. Client is \
a machine which uses USB device provided by server over the network. \
The USB device may be either physical device connected to a server or \
software entity created on a server using USB gadget subsystem."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.5"

RPM_NAME = "usbip-7.2.5-1.39.aarch64.rpm"
RPM_HASH = "a9997d77163e50357fcb10a758d16c6e21abf18bc950b08f3b6eb2b55e899d4ba9918a2e5b0bee98b34753f6bca83673a4ad34545f9ec2147038ba325147686e"

RPROVIDES:${PN} += "libusbip.so.0 \
usbip"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
libwrap.so.0"

inherit rpm
