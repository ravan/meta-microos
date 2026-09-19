SUMMARY = "System Resource and Process Monitoring History Daemon"
DESCRIPTION = "Atop is an ASCII full-screen performance monitor, similar to the top \
command. At regular intervals, it shows system-level activity related to \
the CPU, memory, swap, disks and network layers, and it shows for every \
active process the CPU utilization in system and user mode, the virtual \
and resident memory growth, priority, username, state, and exit code. The \
process level activity is also shown for processes which finished during \
the last interval, to get a complete overview about the consumers of things \
such as CPU time. Atop only shows the active system-resources and processes, \
and only shows the deviations since the previous interval. \
 \
This subpackage contains the permanent monitoring daemon, to store history \
information about processes and system resources."
LICENSE = "GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "atop-daemon-2.13.0-1.1.aarch64.rpm"
RPM_HASH = "f1130508693336facff1c34acea3597e21f0edea7b522517244c2b04050c23b615cb917160f30bba2fcafa8c45b18723d6745c9306ce1a9dc3d5dd882d398369"

RPROVIDES:${PN} += "atop-daemon \
config-atop-daemon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
atop \
libc.so.6"

inherit rpm
