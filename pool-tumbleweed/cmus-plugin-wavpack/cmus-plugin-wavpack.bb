SUMMARY = "WavPack input plugin for the C* Music Player"
DESCRIPTION = "This package provides WavPack input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-wavpack-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "e7caa50b5cced0e9ad0b8c083cc3b1bd93d5add240c54522d9608e075c082e4c4bf1a7bf772a55305b7711125e2dc1771d3b7d5c75ae0f1c6764ac45ba06a078"

RPROVIDES:${PN} += "cmus-plugin-wavpack"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwavpack.so.1"

inherit rpm
