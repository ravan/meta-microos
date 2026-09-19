SUMMARY = "Mozilla Universal Chardet library"
DESCRIPTION = "Mozilla's Universal Charset Detector C/C++ API."
LICENSE = "MPL-1.1"

PV = "1.0.6"

RPM_NAME = "libchardet1-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "6a566a99b46befde59c590907a380351441a7db0ebede9dfff9d7c8f3a46ff2fbb5ee1f79e5ebb9c90ad941d5b541334d0ce9c65268012f758a830fdf8e1b538"

RPROVIDES:${PN} += "libchardet.so.1 \
libchardet1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
libc.so.6 \
libstdc++.so.6"

inherit rpm
