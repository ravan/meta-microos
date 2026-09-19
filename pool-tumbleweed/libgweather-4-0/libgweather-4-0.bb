SUMMARY = "Library to get online weather information"
DESCRIPTION = "This is a library to download weather information from online sources."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libgweather-4-0-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "7fe5a73fa673f7364997da9c28cb02114424a83ad4ab20bfc77270f252fa27b446b6bb19c5ab3fdf407d0b6e7fae0bc5050c8931b2c6a4349424992d884f6478"

RPROVIDES:${PN} += "libgweather-4-0 \
libgweather-4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gweather-locations \
gweather4-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
