SUMMARY = "Abseil library liblibabsl_flags_config"
DESCRIPTION = "This package contains the libabsl_flags_config library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_config2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "ed2e95868ab87f64d518102ae2e06574e4326c935ad7232d5ba79b790f826d06d71ca2eb8aedf29f3e0bf76486d6be981fb31d0d7c27e8e2e097109f55afe928"

RPROVIDES:${PN} += "libabsl-flags-config.so.2608.0.0 \
libabsl-flags-config2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-program-name.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
