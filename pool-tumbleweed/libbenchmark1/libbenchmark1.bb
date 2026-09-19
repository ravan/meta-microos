SUMMARY = "Shared library for google benchmark"
DESCRIPTION = "A library to support the benchmarking of functions, similar to unit-tests."
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "libbenchmark1-1.9.5-2.3.aarch64.rpm"
RPM_HASH = "224552c0bd05b1535ace48918c0838ec2a8946ddce49e1a4d07c5887b2d069efaec9a612d2fa488a19f17b8d75b0b7331490affaa9fb92b423d1cedee8f81953"

RPROVIDES:${PN} += "libbenchmark-main.so.1 \
libbenchmark.so.1 \
libbenchmark1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
