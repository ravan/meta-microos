SUMMARY = "QTermWidget devel package"
DESCRIPTION = "Development environment for qtermwidget library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "qtermwidget-devel-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "870117daa3120314acf2a71ec2386adc75a40fc247784176f49ceea27e871130f4bbeb4c487ae7cb55209a6861228dca50649b5f5e95133f3d1b02230ebca48b"

RPROVIDES:${PN} += "cmake-qtermwidget6 \
pkgconfig-qtermwidget6 \
qtermwidget-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqtermwidget6-2 \
pkgconfig-Qt6Widgets \
pkgconfig-libutf8proc"

inherit rpm
