SUMMARY = "Abseil library liblibabsl_periodic_sampler"
DESCRIPTION = "This package contains the libabsl_periodic_sampler library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_periodic_sampler2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "4a5043e953def8c6c3b3443b1ca1a326d1e7c013cdd153660d45bb0732b0e339cd62a4ba63c5312dd972694f86a3cd791c70ad5591f024692fd0c3b2d1cc30b7"

RPROVIDES:${PN} += "libabsl-periodic-sampler.so.2608.0.0 \
libabsl-periodic-sampler2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-exponential-biased.so.2608.0.0 \
libstdc++.so.6"

inherit rpm
