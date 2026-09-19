SUMMARY = "Runtime library for portable C++ threading and sockets"
DESCRIPTION = " \
 \
 \
GNU uCommon C++ is a lightweight library to facilitate using C++ \
design patterns even for very deeply embedded applications, such as \
for systems using uClibc along with POSIX threading support. \
 \
This subpackage contains a collection of command line tools that use \
various aspects of the ucommon library. Some may be needed to prepare \
files or for development of applications."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "ucommon-7.0.1-2.11.aarch64.rpm"
RPM_HASH = "26bb826876ca380f5342ad2a59d6f3d9ee1a5ac22edd81ea6991638eb302daf0cf2b83983bee5d02da4665f85cb4e4760ee90cf0ff34edca3fa84384d40998de"

RPROVIDES:${PN} += "ucommon \
ucommon-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libucommon.so.8 \
libusecure.so.8"

inherit rpm
