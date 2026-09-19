SUMMARY = "Heap Memory Allocation Profiler"
DESCRIPTION = "A memory profiler for Linux, tracking heap allocations."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "heaptrack-1.5.0-6.8.aarch64.rpm"
RPM_HASH = "3f1eae39ef560b654a151051d9c8d5495ae19e3710647f88dc11e93cbb6821c0b48fb7445ecf11e8cd6385d549e8e7bf0b7703012869bd0ccdbbdb1cd6d811c8"

RPROVIDES:${PN} += "heaptrack \
libheaptrack-inject.so \
libheaptrack-preload.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
