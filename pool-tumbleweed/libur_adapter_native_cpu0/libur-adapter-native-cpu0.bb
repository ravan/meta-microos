SUMMARY = "oneAPI Unified Runtime native CPU adapter"
DESCRIPTION = "oneAPI Unified Runtime (UR) provides a unified interface to device \
agnostic runtimes such as DPC++. \
 \
This package contains the oneAPI Unified Runtime native CPU adapter."
LICENSE = "Apache-2.0"

PV = "0.11.10"

RPM_NAME = "libur_adapter_native_cpu0-0.11.10-2.1.aarch64.rpm"
RPM_HASH = "04c69f406cd06b830e9070f2524e45e53e1c7293f258952a9a8d455aaa7cd4e581809093af1bf691c328ee235fed872cf6c547be66d60a7a2143923ecd10b84f"

RPROVIDES:${PN} += "libur-adapter-native-cpu.so.0 \
libur-adapter-native-cpu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
