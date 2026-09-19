SUMMARY = "API and interchange format for editorial timeline information"
DESCRIPTION = "OpenTimelineIO is an interchange format and API for editorial cut information. \
OTIO contains information about the order and length of cuts and references to \
external media. It is not however, a container format for media."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libopentimelineio18-0.18.0-1.6.aarch64.rpm"
RPM_HASH = "a0547786ddaebf3cfc666c438fd0282d6f61aad274b212aee4cb9b54d2f3effb33bb8e1d1a2c7c6e5f2a16a49856398b4d0c878cff372ba69a2ba2e38405ff2a"

RPROVIDES:${PN} += "libopentime.so.18 \
libopentimelineio.so.18 \
libopentimelineio18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
