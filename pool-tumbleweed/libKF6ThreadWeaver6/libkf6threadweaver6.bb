SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming. It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between jobs \
and ThreadWeaver will work out the most efficient way of dividing the work \
between threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ThreadWeaver6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6ad45cbb9734e4845dd3a473ec15152282d40ec8705ab9e68b49dd4102067b33820d34d9bbbd7232fffe9f73268421be8a37ecbbde88a51723458b3c10a4e93a"

RPROVIDES:${PN} += "libKF6ThreadWeaver.so.6 \
libKF6ThreadWeaver6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
