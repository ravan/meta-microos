SUMMARY = "Process monitoring tool"
DESCRIPTION = "Health-check monitors processes and optionally their child \
processes and threads for a given amount of time.  At the end \
of the monitoring it will display the CPU time used, wakeup \
events generated and I/O operations of the given processes. \
It can be used to diagnose unhealthy bad processes."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-0.03.09-1.22.aarch64.rpm"
RPM_HASH = "49caad4de712d02d95874e9642b49b9f88f769c456dffa36eaa36f6c3629d8ab1379bf7026ae7db8bf95ccb42eba1c5cbada56d62be84087b0e89ef53c6a00e0"

RPROVIDES:${PN} += "health-check"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
