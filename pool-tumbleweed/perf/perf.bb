SUMMARY = "Performance Monitoring Tools for Linux"
DESCRIPTION = "This package provides a userspace tool 'perf', which monitors performance for \
either unmodified binaries or the entire system. It requires a Linux kernel \
which includes the Performance Counters for Linux (PCL) subsystem (>= 2.6.31). \
This subsystem utilizes the Performance Monitoring Unit (PMU) / hardware \
counters of the underlying cpu architecture (if supported)."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "e0b12791a9f542163f0a860628797ed6743db2ec3d7657eef32f53b41963fc97f405097110d0662940ca5faba4e8e4495b9ac6f086bc55d5084cb3236e8cad8c"

RPROVIDES:${PN} += "perf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
liblzma.so.5 \
libm.so.6 \
libnuma.so.1 \
libopencsd-c-api.so.1 \
libpython3.13.so.1.0 \
libslang.so.2 \
libstdc++.so.6 \
libtraceevent.so.1 \
libz.so.1 \
libzstd.so.1 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
