SUMMARY = "Development files for rtaudio"
DESCRIPTION = "RtAudio is a set of C++ classes that provide a common API for \
realtime audio input/output across different operating systems. \
 \
This subpackage contains the headers for rtaudio."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "rtaudio-devel-6.0.1-1.11.aarch64.rpm"
RPM_HASH = "f4288f38049f48e9192437f7415ad7d052c14192eacb856350c6070576ff2f7806aa3fbc17ca6267fc4da101dc03d863074bad2bbe641b0d9517058a1b155414"

RPROVIDES:${PN} += "pkgconfig-rtaudio \
rtaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtaudio7 \
pkgconfig-alsa \
pkgconfig-jack \
pkgconfig-libpulse-simple"

inherit rpm
