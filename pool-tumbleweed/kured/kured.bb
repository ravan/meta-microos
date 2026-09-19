SUMMARY = "Kubernetes daemonset to perform safe automatic node reboots"
DESCRIPTION = "Kured (KUbernetes REboot Daemon) is a Kubernetes daemonset that \
performs safe automatic node reboots when the need to do so is \
indicated by the package management system of the underlying OS. \
 \
- Watches for the presence of a reboot sentinel e.g. /var/run/reboot-required \
 \
- Utilises a lock in the API server to ensure only one node reboots at a time \
 \
- Optionally defers reboots in the presence of active Prometheus alerts \
 \
- Cordons & drains worker nodes before reboot, uncordoning them after"
LICENSE = "Apache-2.0"

PV = "1.21.0"

RPM_NAME = "kured-1.21.0-1.7.aarch64.rpm"
RPM_HASH = "7cb02811c17fb6bd90e12693dc739e26a65383c99e73ee075f793a4ae82547d03c11d58e4ef1052c1d7ccda784fdf73228f78a8cc12c6143c82d58b92fa6886d"

RPROVIDES:${PN} += "kured"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
