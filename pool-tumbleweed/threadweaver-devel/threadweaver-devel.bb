SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "threadweaver-devel-5.116.0-2.6.aarch64.rpm"
RPM_HASH = "3028c13d8bdea5c30c47e27d32b9a25eea8c1b9b1e453003db821f4d62006c6d1a28a56e366cabd9e5f2c5672a68dd708c5991d57ccfd7ac6d5f4956e68d6186"

RPROVIDES:${PN} += "cmake-KF5ThreadWeaver \
threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5ThreadWeaver5"

inherit rpm
