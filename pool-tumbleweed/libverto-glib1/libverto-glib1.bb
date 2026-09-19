SUMMARY = "Backend module for libverto -- glib"
DESCRIPTION = "Module for libverto which provides integration with glib. \
 \
This package does NOT yet provide libverto-module-base."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-glib1-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "c8a37f2713d25fd4b627080b9bf4984d3b8d37bc29366433c49644f4f051cbb86ef4f15ad29755c7da62a86889de9203037176f3394de4b1ccb3380f63215e98"

RPROVIDES:${PN} += "libverto-glib.so.1 \
libverto-glib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libverto.so.1 \
libverto1"

inherit rpm
