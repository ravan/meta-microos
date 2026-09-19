SUMMARY = "Abseil library liblibabsl_debugging_internal"
DESCRIPTION = "This package contains the libabsl_debugging_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_debugging_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "6d51dcd30e224629106c831b740e82517c3533ab32b5dc72993737804391dc713d30a3ec771d676c9f359797a629bc50128c73540f6ca0171bd3e0291aadcf84"

RPROVIDES:${PN} += "libabsl-debugging-internal.so.2608.0.0 \
libabsl-debugging-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
