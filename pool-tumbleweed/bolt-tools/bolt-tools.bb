SUMMARY = "Bolt Tools"
DESCRIPTION = "The bolt-tools package contains optional tools from the Bolt \
software framework."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.11"

RPM_NAME = "bolt-tools-0.9.11-2.1.aarch64.rpm"
RPM_HASH = "901f32c917a090db7f6ac5b2622014430ce26256fd5f8a3928d9efb39a4911ccacfa29534cf32ac3c67a40e85d0e69728886275405553f9b2887ea2c38efda23"

RPROVIDES:${PN} += "bolt-tools"

RDEPENDS:${PN} += "bolt \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
