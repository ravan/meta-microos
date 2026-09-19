SUMMARY = "FLAC Library Development Package"
DESCRIPTION = "This package contains the files needed to compile programs that use \
the FLAC library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.5.0"

RPM_NAME = "flac-devel-1.5.0-1.8.aarch64.rpm"
RPM_HASH = "e3cf846271858c37fc01833b9028854076a331684e40744993d69094d751bc4107810660b9a102c6bbc694fd4e03ac214db8348d8a32f50a7e376cd8ce0e10bd"

RPROVIDES:${PN} += "flac-devel \
pkgconfig-flac \
pkgconfig-flac++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libFLAC++11 \
libFLAC14 \
libstdc++-devel \
pkgconfig-flac \
pkgconfig-ogg"

inherit rpm
