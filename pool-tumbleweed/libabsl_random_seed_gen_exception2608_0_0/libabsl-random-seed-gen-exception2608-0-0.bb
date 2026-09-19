SUMMARY = "Abseil library liblibabsl_random_seed_gen_exception"
DESCRIPTION = "This package contains the libabsl_random_seed_gen_exception library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_seed_gen_exception2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "6740aef2f62e1d7544b6605af6d1d0a4b2564d1c925fe86af5e9c38724ae0d5b288fe4d6c0306f3e540d237ddd0ebf491b332f6bcee0f93efc122d47a9f4709c"

RPROVIDES:${PN} += "libabsl-random-seed-gen-exception.so.2608.0.0 \
libabsl-random-seed-gen-exception2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
