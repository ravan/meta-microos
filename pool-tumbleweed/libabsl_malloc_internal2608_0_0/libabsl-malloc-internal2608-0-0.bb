SUMMARY = "Abseil library liblibabsl_malloc_internal"
DESCRIPTION = "This package contains the libabsl_malloc_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_malloc_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "164262cfbe373fb5a298043646db9586d73297c8c1d18c570bae21593d0cacf069f13e358c2cb599a94594f573c52f55d84bae873c69b48ac46686768434f97a"

RPROVIDES:${PN} += "libabsl-malloc-internal.so.2608.0.0 \
libabsl-malloc-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
