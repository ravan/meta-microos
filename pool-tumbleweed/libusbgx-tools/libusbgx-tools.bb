SUMMARY = "Utilities to show and configure USB gadget devices"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality. \
 \
This subpackage contains utilities to display and configure USB \
gadget devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "libusbgx-tools-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "4365b9e4f864caf47a7bf353a07779ecb1abb42a3eedcdb94acac30c70fb09de9b797b16cf256c84094a36aa98a825b1e7975745f166c88187d02e1e923d58c1"

RPROVIDES:${PN} += "libusbgx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbgx.so.3"

inherit rpm
