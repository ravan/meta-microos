SUMMARY = "Development files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the development files (library and header files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "movit-devel-1.7.1-1.13.aarch64.rpm"
RPM_HASH = "ef8ce3fd56a119f67739a1a9cc0e36b0af6cb009b2a78874cd113ba4b5974e84f9024ab928263c8f650c1f475e035b2405c1c6b191ded3ac442c159b2352f38a"

RPROVIDES:${PN} += "movit-devel \
pkgconfig-movit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmovit8 \
pkgconfig-eigen3 \
pkgconfig-epoxy \
pkgconfig-fftw3"

inherit rpm
