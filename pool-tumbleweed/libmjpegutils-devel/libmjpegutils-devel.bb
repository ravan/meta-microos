SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "This package contains all files needed to develop code that uses the \
mjpegtools libraries."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-devel-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "70c847ddb97baa33910727a9399eb28399ed62c412754f7cb6510d949b99cbf58b39bda560046c85c99e791037bc92ae01fe9b5f6f37b00c98d0530c2e752e30"

RPROVIDES:${PN} += "libmjpegutils-devel \
mjpegtools-devel \
pkgconfig-mjpegtools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblavfile-2-2-0 \
liblavjpeg-2-2-0 \
liblavplay-2-2-0 \
liblavrec-2-2-0 \
libmjpegutils-2-2-0 \
libmpeg2encpp-2-2-0 \
libmplex2-2-2-0"

inherit rpm
