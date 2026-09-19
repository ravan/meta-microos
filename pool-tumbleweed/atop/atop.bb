SUMMARY = "Monitor for System Resources and Process Activity"
DESCRIPTION = "Atop is an ASCII full-screen performance monitor, similar to the top \
command. At regular intervals, it shows system-level activity related to \
the CPU, memory, swap, disks and network layers, and it shows for every \
active process the CPU utilization in system and user mode, the virtual \
and resident memory growth, priority, username, state, and exit code. The \
process level activity is also shown for processes which finished during \
the last interval, to get a complete overview about the consumers of things \
such as CPU time. Atop only shows the active system-resources and processes, \
and only shows the deviations since the previous interval."
LICENSE = "GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "atop-2.13.0-1.1.aarch64.rpm"
RPM_HASH = "c3d2f7f4322c21a19628d614c29a64569f5374b6ea8fbc537fdb93f48d4ff6aef057c511a8b601be3e7e05e77108cda483392853dd763b9a7e460dc476a684d8"

RPROVIDES:${PN} += "atop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
systemd"

inherit rpm
