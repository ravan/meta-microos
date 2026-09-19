SUMMARY = "Library for resource discovery and announcement over SSDP"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "libgssdp-1_6-0-1.6.6-1.3.aarch64.rpm"
RPM_HASH = "6007109247d967f0caa2aa85d3691147fd77140ba66fc2f21961b9a7bf0526afde0da78d0154e0545df9b0ae9151698a3cfbeb52578d241a158195d2b0dbbd71"

RPROVIDES:${PN} += "libgssdp-1-6-0 \
libgssdp-1.6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
