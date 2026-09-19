SUMMARY = "Development files for libcnotify, a C notify library"
DESCRIPTION = "A library for C notify functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcnotify."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcnotify-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "014c937dd93e0527b8bd82dd53986c48ba541395265632d38757c985766e1514ea0f758b15c780d4c6aef153da7bd65ee6c6973da367c062367ac5d5f31182ab"

RPROVIDES:${PN} += "libcnotify-devel \
pkgconfig-libcnotify"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcnotify1"

inherit rpm
