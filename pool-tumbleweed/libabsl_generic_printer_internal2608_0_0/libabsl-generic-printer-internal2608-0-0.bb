SUMMARY = "Abseil library liblibabsl_generic_printer_internal"
DESCRIPTION = "This package contains the libabsl_generic_printer_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_generic_printer_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "43db39037a4a0d717cffbe991f93617e5f358422234dec0fce760d35ddd793a909bb3fbba7f11af863197ce99fefc79e0a40d66d3d162df134e4e8e4f16500e0"

RPROVIDES:${PN} += "libabsl-generic-printer-internal.so.2608.0.0 \
libabsl-generic-printer-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
