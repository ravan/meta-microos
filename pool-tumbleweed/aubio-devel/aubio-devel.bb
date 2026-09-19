SUMMARY = "Development package for aubio library"
DESCRIPTION = "This package contains the files needed to compile programs that use \
aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9+git376"

RPM_NAME = "aubio-devel-0.4.9+git376-1.1.aarch64.rpm"
RPM_HASH = "bee82ba087d8938edc7baded6d71af43aedf1a2ba6784dbbfc0234ccf49320c0946492e67ea7c0b6eaafda026d840c4df1dc8ac25b1e76c58a51860bca9d796e"

RPROVIDES:${PN} += "aubio-devel \
libaubio-devel \
pkgconfig-aubio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaubio5"

inherit rpm
