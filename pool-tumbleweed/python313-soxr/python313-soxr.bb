SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "python313-soxr-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "d5d1782f0beefb8c7416172078441e90a37ddc49537b77fe647c4950c6c76c0c46629ecd25e04928f12a33175c3288440d18f16e00ef680001a8de84b0e86a4c"

RPROVIDES:${PN} += "python3-soxr \
python3.13dist-soxr \
python313-soxr \
python3dist-soxr"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsoxr.so.0 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
