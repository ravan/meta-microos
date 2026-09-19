SUMMARY = "Librem development files"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librem."
LICENSE = "BSD-3-Clause"

PV = "2.12.0"

RPM_NAME = "rem-devel-2.12.0-1.20.aarch64.rpm"
RPM_HASH = "e3554372a18024513bf37d94e6fc43af0f9f23057b1d3704e94b540df7913d5a329da1fc69dd165ed79d41fc12bf27550523f1ff9608e6ed61cdcdcc341ea5e3"

RPROVIDES:${PN} += "pkgconfig-librem \
rem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librem6"

inherit rpm
