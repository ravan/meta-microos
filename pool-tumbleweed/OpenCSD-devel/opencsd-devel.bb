SUMMARY = "Headers for OpenCSD, a CoreSight Trace Decode library"
DESCRIPTION = "Header files and libraries for C and C++ development with OpenCSD."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "OpenCSD-devel-1.8.3-1.2.aarch64.rpm"
RPM_HASH = "3d68d6e79e8635830405436c38379fad3c528becebfb803ed18e2d3febea1ede6bdb013bdc09b06e94e9aae39b8a8fa9b114706cb720426f211192dd977cdce9"

RPROVIDES:${PN} += "OpenCSD-devel"

RDEPENDS:${PN} += "libopencsd-c-api1 \
libopencsd1"

inherit rpm
