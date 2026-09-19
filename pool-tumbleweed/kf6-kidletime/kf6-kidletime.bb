SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kidletime-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "37ee905684a953b6b9dcfbaf94f83fe6c11062d2e4d4c861d59e448fd4df7829ba716bcbab2ab9608d83be5414e8d958706f3f9ab47029723f6101386c4797e6"

RPROVIDES:${PN} += "kf6-kidletime"

RDEPENDS:${PN} += ""

inherit rpm
