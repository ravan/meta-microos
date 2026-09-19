SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-devel-0.4.8-11.39.aarch64.rpm"
RPM_HASH = "38acf9f4d80d7b291cc35a1a1cb3efaf451991862b96daa4b0e0162dd466b8c45dee28553e88192a64bfcfc7b597acbaa207e0faa16b607b0a52e3d25d54f432"

RPROVIDES:${PN} += "obby-devel \
pkgconfig-obby-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libsigc++2-devel \
net6-devel \
obby \
pkgconfig-avahi-client \
pkgconfig-net6-1.3 \
pkgconfig-sigc++-2.0"

inherit rpm
