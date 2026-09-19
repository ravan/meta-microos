SUMMARY = "Development files for bshoshany-thread-pool"
DESCRIPTION = "Header files for the BS::thread_pool C++17 thread pool library \
(header-only). Since v5 the utility helpers are part of the single \
BS_thread_pool.hpp header."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "bshoshany-thread-pool-devel-5.1.0-1.2.noarch.rpm"
RPM_HASH = "f28e6db33f52d988f2fef7511873860fff30e2e18fcde9c33914f5e31996bc963c47227e5f3a6f538fcb8fa66721f410ac4acef65e0ced04e3b6a9269956c2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bshoshany-thread-pool-devel"

RDEPENDS:${PN} += "libstdc++-devel"

inherit rpm
