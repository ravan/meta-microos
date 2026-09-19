SUMMARY = "Abseil library liblibabsl_strings_internal"
DESCRIPTION = "This package contains the libabsl_strings_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_strings_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "88bbb4dd29167f8cb13ebb0b2dc8e1e852384ac1bd747c70a3be49134bdebcc5a07951bae96576b53d806a47de621125cbc42cb45b022f566a9a78276b206d5e"

RPROVIDES:${PN} += "libabsl-strings-internal.so.2608.0.0 \
libabsl-strings-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
