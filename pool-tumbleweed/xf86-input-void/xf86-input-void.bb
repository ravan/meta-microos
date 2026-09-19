SUMMARY = "Null input driver for the Xorg X server"
DESCRIPTION = "void is an dummy/null Xorg input driver. It doesn't connect to any \
physical device, and it never delivers any events. It functions as both \
a pointer and keyboard device, and may be used as X server's core \
pointer and/or core keyboard. Its purpose is to allow X servers pre \
version 1.4 to operate without a core pointer and/or core keyboard."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "xf86-input-void-1.4.2-1.13.aarch64.rpm"
RPM_HASH = "eb59de3761aea7c7ecab3ddfbf1d9f36f8d877723de81474e2f58a3be9cbe0860142907857e2e1624fc6f9fd7d405ca14dea42c0138489c2979c6eae2eb75f92"

RPROVIDES:${PN} += "xf86-input-void"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
