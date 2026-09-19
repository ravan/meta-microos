SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kidletime-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "be86b7d877357b23c5f52b232bf9f46767b54a4c726dcd3dc08fc2043fa59b485d52faeb61e8ddd21eaa2874a35283d7390cd0c0bfdbe6e8cfed499b812a3be7"

RPROVIDES:${PN} += "cmake-KF6IdleTime \
kf6-kidletime-devel"

RDEPENDS:${PN} += "libKF6IdleTime6"

inherit rpm
