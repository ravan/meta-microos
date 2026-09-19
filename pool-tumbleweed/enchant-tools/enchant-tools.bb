SUMMARY = "Command line tools for the Enchant spell checking library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-tools-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "da4ef5cf41c9e92574c0083c5bd90278d7abc89d6992f5e6f18cb9b2586620e0e243f465e98bfd65f898e1623c67adc974ff8c25661f488cd339137eb1c6b436"

RPROVIDES:${PN} += "enchant-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
