SUMMARY = "Abseil library liblibabsl_random_distributions"
DESCRIPTION = "This package contains the libabsl_random_distributions library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_distributions2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f442605f1aeb60db4409b5de279e521fe6d51dbd176ab06ac28ac7e217f98e89f63d6fbc72662331224cef35990669987e78359c947683c761c4bab5918b77cc"

RPROVIDES:${PN} += "libabsl-random-distributions.so.2608.0.0 \
libabsl-random-distributions2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
