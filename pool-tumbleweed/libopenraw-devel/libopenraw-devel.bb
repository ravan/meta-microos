SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libopenraw-devel-0.3.7-1.14.aarch64.rpm"
RPM_HASH = "c26b291058ac989b4e01af59f5b4890368404ff8a59684772b07dbebb2f15b2c74d5034358c028488161e3dae237f9771520891715ff2c7fd6479a8ec0823e7e"

RPROVIDES:${PN} += "libopenraw-devel \
pkgconfig-libopenraw-0.3 \
pkgconfig-libopenraw-gnome-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gdk-pixbuf-devel \
libopenraw9 \
pkgconfig-libopenraw-0.3"

inherit rpm
