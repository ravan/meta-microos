SUMMARY = "Abseil library liblibabsl_time"
DESCRIPTION = "This package contains the libabsl_time library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_time2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "fa04a6ad746ab134d724b03d61d9caa68db432d0b8233e9651a43a325cad72eff3e9a8124e82a4ff163fc24787ad5d843a98dbad635d704b2ca2d6b1556adf7d"

RPROVIDES:${PN} += "libabsl-time.so.2608.0.0 \
libabsl-time2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-time-zone.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
