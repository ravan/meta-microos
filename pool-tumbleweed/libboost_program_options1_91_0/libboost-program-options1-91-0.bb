SUMMARY = "Boost.ProgramOptions runtime library"
DESCRIPTION = "This package contains the Boost.ProgramOptions runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_program_options1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "c1d642ddad521241efa0c6ddda221da886e9f4997857331c20b586f144fb8e41ce8a71150cbe083620d55b15bf09408c1d5c31a078718538f0738a74ba5485f5"

RPROVIDES:${PN} += "libboost-program-options.so.1.91.0 \
libboost-program-options1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
