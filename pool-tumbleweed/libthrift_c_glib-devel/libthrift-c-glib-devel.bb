SUMMARY = "Thrift C (GLib) library development files"
DESCRIPTION = "Development files for the GLib based C API of the Thrift software \
framework. Kept apart from libthrift-devel so that C++ consumers do \
not pull in the GLib stack, and vice versa."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthrift_c_glib-devel-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "359c5c0b51f7f66440a8045360eb729de0f8111943ef3f0df9f689d14262c7c8ff1c2dd7e6feea24b288ad3e98c0f4b55304579e2a3966dc8ab0f5649cba5175"

RPROVIDES:${PN} += "libthrift-c-glib-devel \
pkgconfig-thrift-c-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthrift-c-glib0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
