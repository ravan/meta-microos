SUMMARY = "Abseil library liblibabsl_random_internal_seed_material"
DESCRIPTION = "This package contains the libabsl_random_internal_seed_material library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_seed_material2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "110997b6c383a92467b1871d3ef88d1c567a3714ce86c2eed0bb4aabd195cc46c7d9f9755f3b81f704232acab3dedd25d58eabcb740b9dc130c103e01a0ef57f"

RPROVIDES:${PN} += "libabsl-random-internal-seed-material.so.2608.0.0 \
libabsl-random-internal-seed-material2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
