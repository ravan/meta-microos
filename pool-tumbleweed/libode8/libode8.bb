SUMMARY = "Open Dynamics Engine Library development files"
DESCRIPTION = "ODE is an open source, high performance library for simulating rigid \
body dynamics. It is fully featured, stable, mature and platform \
independent with an easy to use C/C++ API. It has advanced joint types \
and integrated collision detection with friction. ODE is useful for \
simulating vehicles, objects in virtual reality environments and \
virtual creatures. It is currently used in many computer games, 3D \
authoring tools and simulation tools."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "libode8-0.16.5-1.10.aarch64.rpm"
RPM_HASH = "581b11d71f9ae46abbab295d0442666ad68138ca9e7b7d0c9217c7eff25d59b513bd0d8cd359ea0c07d2ee4b82e635833a7b3498e32dd88a37d9e0a061131ff5"

RPROVIDES:${PN} += "libode.so.8 \
libode8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
