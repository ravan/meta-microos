SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-devel-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "3464a621843b85aa2d35ebdaac15cd83d6d70fe7d284ef67eec4f41f6e8802a4bd5f7eb29517df4d115331711dbaa00364f3e5c0db0f2387e3fe6e18c2b6a39c"

RPROVIDES:${PN} += "dapl-debug-devel"

RDEPENDS:${PN} += "dapl-debug \
glibc-devel"

inherit rpm
