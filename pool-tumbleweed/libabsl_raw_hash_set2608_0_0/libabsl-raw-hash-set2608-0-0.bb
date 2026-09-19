SUMMARY = "Abseil library liblibabsl_raw_hash_set"
DESCRIPTION = "This package contains the libabsl_raw_hash_set library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_raw_hash_set2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "04e3373994931a29d3e18b60883230cc2af5249a592571fe166fdc7983466cd6c37eeba9b53037392c97132c70b6da6389fa82b28ad8264298867c2c0b56b8ba"

RPROVIDES:${PN} += "libabsl-raw-hash-set.so.2608.0.0 \
libabsl-raw-hash-set2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-hashtablez-sampler.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
