SUMMARY = "GPU Trace Visualizer"
DESCRIPTION = "Gpuvis is a Linux GPU profiler similar to GPUView on Windows. It is designed to work with trace-cmd captures and help track down Linux gpu and application performance issues."
LICENSE = "MIT"

PV = "20230221"

RPM_NAME = "gpuvis-20230221-3.5.aarch64.rpm"
RPM_HASH = "f7a9cb62307257db61042c9e3fa43a7e00df40924345adc5e27b0f7acdfee8dc194b1d7aa92c89db7a9b20630667bc4a6ad1ae573d8909d93d09cf7d201915b5"

RPROVIDES:${PN} += "gpuvis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
