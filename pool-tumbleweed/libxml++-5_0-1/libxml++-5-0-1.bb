SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.2.1"

RPM_NAME = "libxml++-5_0-1-5.2.1-3.6.aarch64.rpm"
RPM_HASH = "578cb73b665f6ef1aad6492ec537ee4cc578af3a8ea4f4e74d7bc7f380afa9f6aded8b9a85e5154a0c8225a906b8c7f378f565076c814cd7ad7b10bd65d51c3a"

RPROVIDES:${PN} += "libxml++ \
libxml++-5-0-1 \
libxml++-5.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
