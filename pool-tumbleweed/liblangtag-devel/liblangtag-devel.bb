SUMMARY = "Files for Developing with liblangtag"
DESCRIPTION = "liblangtag is an interface library to access tags for identifying \
languages. \
 \
This package contains the liblangtag development files."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.8"

RPM_NAME = "liblangtag-devel-0.6.8-1.3.aarch64.rpm"
RPM_HASH = "4420e0f87f72c948a36c5f8ec45231b4d893d1b83d103f093fa95dcec9a83044bad3f799364ff533b640371f60be7859631317b308d844b3698cad924e9052de"

RPROVIDES:${PN} += "liblangtag-devel \
pkgconfig-liblangtag"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblangtag1 \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
