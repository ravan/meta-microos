SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-spa-tools-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "ab5efe3d40fc03626a7b075604e98d893215c4b72af049ea4a0d959dd350424474c97204f49a688a4e106a10d6b8943e5e0428aff756e8b9831c5fee628e4a33"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
