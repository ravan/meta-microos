SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains basic helper library needed for qtcurve."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-utils2-1.9.0-8.7.aarch64.rpm"
RPM_HASH = "3653a1b3304ea379b7275fa4d1c70b05b2f0b81118cfb04793c13100cd761e03f042f9f618fc56f7af3a514f2caf0047c7ba8d208ae98a7c98cf62dc8123bf3b"

RPROVIDES:${PN} += "libqtcurve-utils.so.2 \
libqtcurve-utils2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
