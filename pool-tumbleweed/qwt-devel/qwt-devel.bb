SUMMARY = "Include headers and Qt Designer plugin for Qwt"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-5.2.3_qt5+git20181129.2819734-4.8.aarch64.rpm"
RPM_HASH = "e688105ab3f326a62515898493324729a2ee4165a2df98656af5edbc15ed816ac7d468545fd82a09ef939fdf10075de18233540335265a120703b02e31af790c"

RPROVIDES:${PN} += "libqwt5-devel \
pkgconfig-qwt5-qt5 \
qwt \
qwt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libpng-devel \
libqwt5-qt5-5 \
pkgconfig-Qt5Gui \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Svg \
pkgconfig-Qt5Widgets"

inherit rpm
