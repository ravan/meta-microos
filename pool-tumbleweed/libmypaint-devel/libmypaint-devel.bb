SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects. \
This package provides the header needed for developing \
applications using libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-devel-1.6.1-2.14.aarch64.rpm"
RPM_HASH = "a2e2f49af1267db0297ea3cd500d9b049d4a81bb040e17c70d7703d41b5453af40136cf330df365417d8bec149fd2441257d40072656cc9d1bc26732db8c4961"

RPROVIDES:${PN} += "libmypaint-devel \
mypaint-devel \
pkgconfig-libmypaint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmypaint0 \
pkgconfig-json-c"

inherit rpm
