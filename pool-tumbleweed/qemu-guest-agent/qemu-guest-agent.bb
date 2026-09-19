SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-guest-agent-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "af2d4b3d79275810ede7da52b675d8221a64be0ae2da1e0d83a9b6f086b8a30116993873c9abb3469ee6a004e18e8bf797273e1a8b419625b68a12390952e32f"

RPROVIDES:${PN} += "qemu-guest-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1 \
libudev.so.1 \
liburing.so.2 \
udev"

inherit rpm
