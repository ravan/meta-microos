SUMMARY = "Daemon that finds starving tasks and gives them a temporary boost"
DESCRIPTION = "The stalld program monitors the set of system threads, \
looking for threads that are ready-to-run but have not \
been given processor time for some threshold period. \
When a starving thread is found, it is given a temporary \
boost using the SCHED_DEADLINE policy. The default is to \
allow 10 microseconds of runtime for 1 second of clock time."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.21.1"

RPM_NAME = "stalld-1.21.1-1.9.aarch64.rpm"
RPM_HASH = "3998ce587ecd00216546083e970e1113f55d29ea31ad1ac2fd28c98b7dfdd18ef2d0561c20801ec0d5fd3afc4d9236fab4098302a93c153ba676f4a13389eba3"

RPROVIDES:${PN} += "stalld"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
systemd \
util-linux"

inherit rpm
