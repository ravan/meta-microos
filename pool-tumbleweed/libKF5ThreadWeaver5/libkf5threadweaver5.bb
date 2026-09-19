SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ThreadWeaver5-5.116.0-2.6.aarch64.rpm"
RPM_HASH = "ebcb4fd136e972be9dec7d5095bfb847bdbfb31b0d3a7d9bf41cbea700b413ee2137321acf1b540bdfe2b80a57927abdb4686c66a2b714816708a4b982abc02c"

RPROVIDES:${PN} += "libKF5ThreadWeaver.so.5 \
libKF5ThreadWeaver5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
