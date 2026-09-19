SUMMARY = "Files for Developing with libfreehand"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice. \
 \
This package contains the libfreehand development files."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-0.1.2-2.29.aarch64.rpm"
RPM_HASH = "923d67f90cca463d2f3d93e2933209223ea4a361666bd3b36b1ab2f0b7f143a713636895fbd79960d274975f781548fb74347ec18e2ce3ba66a8379d5696f6fb"

RPROVIDES:${PN} += "libfreehand-devel \
pkgconfig-libfreehand-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreehand-0-1-1 \
pkgconfig-librevenge-0.0 \
pkgconfig-zlib"

inherit rpm
