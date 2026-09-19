SUMMARY = "Software-defined receiver for GNSS signals"
DESCRIPTION = "An SDR receiver able to detect and decode signals according to \
various standards: \
 \
- GPS (L1, L2C, L5 bands) \
- GLONASS (L1, L2 bands) \
- BeiDou (B1I, B3I bands) \
- Galileo (E1b/c, E5a bands) \
 \
It can process signal in realtime or prerecorded signals and \
output process signals in various formats."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-only & BSD-1-Clause & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "0.0.21"

RPM_NAME = "gnss-sdr-0.0.21-1.2.aarch64.rpm"
RPM_HASH = "7ac77d193d26db8ed6290cd1fea0eee97b8e833fcc4896ca7ded1b4f2070e1b4cf5e43c042821010775d25345e44c0b8307b608ba38de8d9162fc25bf7f6df6c"

RPROVIDES:${PN} += "gnss-sdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-config.so.2608.0.0 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-parse.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-flags-usage.so.2608.0.0 \
libabsl-log-initialize.so.2608.0.0 \
libabsl-log-internal-log-sink-set.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-log-sink.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libarmadillo.so.15 \
libblas.so.3 \
libboost-serialization.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-fft.so.3.10.12 \
libgnuradio-filter.so.3.10.12 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libgnuradio-zeromq.so.3.10.12 \
liblapack.so.3 \
libm.so.6 \
libmatio.so.14 \
libprotobuf.so.36.1.0 \
libpugixml.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libvolk-gnsssdr.so.0.0.21 \
libvolk.so.3.3"

inherit rpm
