SUMMARY = "Package providing R-parallel"
DESCRIPTION = "This package provides R-parallel, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-parallel-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "6461bd0f761503de4aacf7b9e421927ec8a6d4e09d7aceec95d392821e1527e4e8fe64be2839d28f5c8741fa5e33122ca1594346c7786dcddbc38a065d9493bf"

RPROVIDES:${PN} += "R-parallel"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
