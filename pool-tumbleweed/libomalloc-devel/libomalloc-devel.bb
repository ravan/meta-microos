SUMMARY = "Development files for the omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libomalloc-devel-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "06f8bd31a7e6b3ca40bf355f503a23d2c6f26a351f45bd362e57e3b549a4bd42e1d9250e6de8a41873e1177ddaaeb585711567e08d318c3613ab270507caea86"

RPROVIDES:${PN} += "libomalloc-devel \
pkgconfig-omalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomalloc-4-4-1"

inherit rpm
