SUMMARY = "Development files for qpdf PDF manipulation library"
DESCRIPTION = "The qpdf-devel package contains header files and libraries necessary \
for developing programs using the qpdf library."
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "qpdf-devel-12.4.1-1.1.aarch64.rpm"
RPM_HASH = "c85edc93e9274c993b4a11eb146305043b931c4b8fda41b1c8278344344017fb7a1da08ce3656ea781683357fd28967bf123c2b7ab5a580f89da2da6fa3628a4"

RPROVIDES:${PN} += "cmake-qpdf \
pkgconfig-libqpdf \
qpdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqpdf30 \
libstdc++-devel \
pkgconfig-gnutls \
pkgconfig-libjpeg \
pkgconfig-zlib \
qpdf"

inherit rpm
