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

RPM_NAME = "ode-devel-0.16.5-1.10.aarch64.rpm"
RPM_HASH = "cf52c87c5d95ed66e6cb36b4e035a0f8e7e4457550c817bd2074949dfea9c0e56d39c8a9596c64be9173ff150e4ff66ce168d198715752edb8622e9b83620f60"

RPROVIDES:${PN} += "libode-devel \
ode-devel \
pkgconfig-ode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libode8"

inherit rpm
