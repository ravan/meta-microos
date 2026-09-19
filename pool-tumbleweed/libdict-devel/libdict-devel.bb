SUMMARY = "Header files for libdict"
DESCRIPTION = "Development and header files for libdict."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "libdict-devel-1.0.3-1.11.aarch64.rpm"
RPM_HASH = "1cf9974ac2e14c6f6c0ef91f434f048c84e867f88755ae71e0fbf851d162c94fb75c90b9a5dbacbdaef3a5ab60f5d0827b6904aec3a104fd055f45989ef4b324"

RPROVIDES:${PN} += "libdict-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdict.so.1.0 \
libdict1-0"

inherit rpm
