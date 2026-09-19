SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.44"

RPM_NAME = "glibc-profile-2.44-2.1.aarch64.rpm"
RPM_HASH = "a314457a806722db8286c850d61e3b2c72d23bc0bade026969ec9b12f5b876a0ebe918e3aa2cc2a75a6a7de407a3db353e38ca9992a58176161d07954b26f0ef"

RPROVIDES:${PN} += "glibc-profile"

RDEPENDS:${PN} += "glibc"

inherit rpm
