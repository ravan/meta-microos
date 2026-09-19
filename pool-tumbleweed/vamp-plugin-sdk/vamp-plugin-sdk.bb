SUMMARY = "An API for audio analysis and feature extraction plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-2.10.0-1.24.aarch64.rpm"
RPM_HASH = "9e4ae041a1d6c118040d3a7fd8d618a0ee40e719c2ea08f8e7c05a1ec88b77df926f6540d76be7acbca34bfe4997d28359839977484359d7b5dd0eb1724f77ce"

RPROVIDES:${PN} += "vamp-plugin-sdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
