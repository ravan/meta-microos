SUMMARY = "Collection of video4linux support libraries"
DESCRIPTION = "libv4l is a collection of libraries which adds a thin abstraction layer on \
top of video4linux2 devices. The purpose of this (thin) layer is to make it \
easy for application writers to support a wide variety of devices without \
having to write separate code for different devices in the same class."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4l-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "698a66fae1a3861e80f450d44f7b3f4a1a61758e8367b6ed9e22569485dfce66fc69756836a2aaab2c02689064028fb914e51db0760988ab604847d98ba8f7e6"

RPROVIDES:${PN} += "libv4l \
libv4l-mplane.so \
libv4l2tracer.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libv4l1.so.0 \
libv4l2.so.0"

inherit rpm
