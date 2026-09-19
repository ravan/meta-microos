SUMMARY = "Abseil library liblibabsl_cordz_info"
DESCRIPTION = "This package contains the libabsl_cordz_info library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cordz_info2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "0f8b39bccfa42043196a482ffb117fca4adc590a710d3cf20d70cc06f7d4dada74a59537af97242fc5a11d0ed40a20cc85798a62b17cf215b07e40aee7be6e20"

RPROVIDES:${PN} += "libabsl-cordz-info.so.2608.0.0 \
libabsl-cordz-info2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cordz-handle.so.2608.0.0 \
libabsl-stacktrace.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
