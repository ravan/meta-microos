SUMMARY = "System-Wide Profiler for Linux Systems"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
It consists of a kernel module and a daemon for collecting sample data, \
and several post-profiling tools for turning data into information. \
 \
OProfile leverages the CPU hardware performance counters to enable \
profiling of a wide variety of interesting statistics, which can also \
be used for basic time-spent profiling. All code is profiled: hardware \
and software interrupt handlers, kernel modules, the kernel, shared \
libraries, and applications (the only exception being the oprofile \
interrupt handler itself). \
 \
OProfile is currently in alpha status; however it has proven stable \
over a large number of differing configurations. As always, there is no \
warranty. \
 \
This is the package containing the userspace tools."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "oprofile-1.4.0-5.2.aarch64.rpm"
RPM_HASH = "64b5c5c3b315556627ebcf23b0310b3a3b4b1b6f573be3a9d9b692c73a9876b90d2c1033ad7bb5475f4475a94cda1b06d93df9b2c01e85353796ac9f71daec5c"

RPROVIDES:${PN} += "libjvmti-oprofile.so \
oprofile"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopagent.so.1 \
libpopt.so.0 \
libsframe.so.2 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
pwdutils"

inherit rpm
