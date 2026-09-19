SUMMARY = "Loudness measurement according to EBU-R128"
DESCRIPTION = "Ebumeter provides real-time level metering according to the EBU R-128 \
recommendation. The current release implements all features required \
by the EBU document except the oversampled peak level monitoring. \
ebumeter can only be used with JACK. \
 \
A separate command-line utility (ebur128) to measure audio files is \
provided as well."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "ebumeter-0.5.1-2.16.aarch64.rpm"
RPM_HASH = "0bb7b04db939f43a4298c22d13cabd169151cd3afbe6eef9493b0b9dd3135c5345916519dcaa9eec4b09dbd47ba104aa0b53f0e21d967c48d698a83ae5fdf16a"

RPROVIDES:${PN} += "ebumeter \
ebur128"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libclthreads.so.2 \
libclxclient.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libmvec.so.1 \
libpng16.so.16 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-resampler.so.1"

inherit rpm
