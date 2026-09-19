SUMMARY = "Tools for Perseus SDR"
DESCRIPTION = "Tools for Perseus SDR devices."
LICENSE = "GPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "perseus-sdr-tools-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "b43b08476e4d8fa0fe28a3d6b6a8f1c9f410650d4351157e508acd50a8833765becc7e4c123ce289bde4fa7a72e082431cc775a3b5761ffe81e83113b9c742ab"

RPROVIDES:${PN} += "perseus-sdr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperseus-sdr.so.0 \
libusb-1.0.so.0"

inherit rpm
