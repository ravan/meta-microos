SUMMARY = "Tools from Exempi, an XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP is a kind of \
metadata for images and PDF. \
 \
This subpackage contains utilities from the Exempi project."
LICENSE = "BSD-3-Clause"

PV = "2.6.6"

RPM_NAME = "exempi-tools-2.6.6-1.5.aarch64.rpm"
RPM_HASH = "471169967eb72c16c29b987d51840615ffe81b22ce58df20f0e3d11a21943f54d7ccb3018d41cd18af00b5566d3e5b7b160ee6b62c7ef74c104b471a1fd85b6d"

RPROVIDES:${PN} += "exempi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexempi.so.8 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
