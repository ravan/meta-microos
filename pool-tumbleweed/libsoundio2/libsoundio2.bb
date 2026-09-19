SUMMARY = "A C99 library for realtime audio input/output"
DESCRIPTION = "This appropriate for games, music players, digital audio workstations, and \
various utilities. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libsoundio2-2.0.0-1.21.aarch64.rpm"
RPM_HASH = "8629c17292b9491ca382f3a8a6f78616a1110f4e7a79c81d50ba931c0751c0751ffd9cb9e7f3a4c1e347d3cc5c714ef1320c31df60afcea8f0d8adf428ead1b4"

RPROVIDES:${PN} += "libsoundio.so.2 \
libsoundio2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libjack.so.0 \
libpulse.so.0"

inherit rpm
