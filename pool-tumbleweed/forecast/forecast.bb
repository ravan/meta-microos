SUMMARY = "Weather app written in rust and libcosmic"
DESCRIPTION = "A simple weather application for the COSMIC Desktop"
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20241006.f98528a"

RPM_NAME = "forecast-0.1.0+git20241006.f98528a-1.16.aarch64.rpm"
RPM_HASH = "a3c21583d8082eb74c3282f88d5bed2319d99362bf28100e0d9ad597982bc5c33cc685030468aec9fde74aeca8a194ff6ec0afe9eae5e76834fea09073973935"

RPROVIDES:${PN} += "forecast"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libxkbcommon.so.0"

inherit rpm
