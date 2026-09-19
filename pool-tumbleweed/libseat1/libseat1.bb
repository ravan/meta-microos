SUMMARY = "Seat management library"
DESCRIPTION = "A seat management library allowing applications to use whatever seat management is available. \
Supports: seatd, (e)logind, embedded seatd for standalone operation"
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "libseat1-0.9.3-1.3.aarch64.rpm"
RPM_HASH = "0b8dbb80e0850b9f9e9b497f6b1932288743e5daaf8bf16f632c4f6eb08039070c055dd0eeec7b6371adc27e16f3f433b10c744b21c9fa9dbd2dd97ac364c6b5"

RPROVIDES:${PN} += "libseat.so.1 \
libseat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
