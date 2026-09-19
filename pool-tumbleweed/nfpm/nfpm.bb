SUMMARY = "Simple deb, rpm, apk and arch linux packager written in Go"
DESCRIPTION = "nFPM is a simple and 0-dependencies deb, rpm, apk and arch linux packager \
written in Go"
LICENSE = "MIT"

PV = "2.47.0"

RPM_NAME = "nfpm-2.47.0-1.3.aarch64.rpm"
RPM_HASH = "4cfd6bb4326f28f6b7c34fb33ce3c80ef1a0f406cc5a29452bb0b8937931d759544ae90f1925afba0d6fd9e4a7dbfd2804b26bc3fe16d07ab54aa1819423e3f9"

RPROVIDES:${PN} += "nfpm"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
