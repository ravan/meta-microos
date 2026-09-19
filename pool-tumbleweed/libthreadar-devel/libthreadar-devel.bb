SUMMARY = "Development files for libthreadar"
DESCRIPTION = "libthreadar is a C++ library containing a set of high level classes for threads management. \
 \
This package contains the files needed to build using libthreadar."
LICENSE = "LGPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "libthreadar-devel-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "7b01825af565783dc33e8f15c75299ebf474784bc848d060e027e0d6c2ef8b4bf4c5dd685c2e7b7c0f0ceb7f1bed35cdecc6e42e76824e4a61fdcc377f792483"

RPROVIDES:${PN} += "libthreadar-devel \
pkgconfig-libthreadar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthreadar1000"

inherit rpm
