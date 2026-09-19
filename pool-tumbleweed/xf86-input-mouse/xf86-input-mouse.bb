SUMMARY = "Mouse input driver for the Xorg X server"
DESCRIPTION = "mouse is an Xorg input driver for mice. The driver supports most \
available mouse types and interfaces, though the level of support for \
types of mice depends on the OS."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "xf86-input-mouse-1.9.5-1.11.aarch64.rpm"
RPM_HASH = "c4bf945e2ef01ade9299784f06edbe15b7eed3620b828d14c0b4c431c17ab7e0b5aa4fe7ca6757d9a7ebbf4869eec1a81900acde1de51201d60a57081bde5a8e"

RPROVIDES:${PN} += "xf86-input-mouse"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
