SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "sysprof-50.0-1.3.aarch64.rpm"
RPM_HASH = "6e72de3f6495d8e93675e82d3904c62cbbfd97d0249de6bf2bae4aa97d521fadd16429ee82da7b2705c1f71de33cc6c003a231b7edc7e7bd8361916b49518a28"

RPROVIDES:${PN} += "libsysprof-memory-6.so \
libsysprof-speedtrack-6.so \
libsysprof-tracer-6.so \
sysprof"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdex-1.so.1 \
libdw.so.1 \
libelf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libunwind.so.8"

inherit rpm
