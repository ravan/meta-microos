SUMMARY = "Driver for Lexmark Printers 7000, 7200, and 5700"
DESCRIPTION = "A driver for Lexmark printers 7000, 7200, and 5700. This driver \
translates PBM (Portable Bitmap) into the printer protocol for the \
Lexmark printers 7000, 7200, and 5700. \
 \
 \
 \
Authors: \
-------- \
    Henryk Paluch <paluch@bimbo.fjfi.cvut.cz>"
LICENSE = "GPL-2.0-or-later"

PV = "990321"

RPM_NAME = "pbm2l7k-990321-951.11.aarch64.rpm"
RPM_HASH = "3529f66aec4f5bf51c2b319cdf3611b1894cd78529dfa95c67ff762abbf811d4ff2f9e52412a1de615d58392f066eb41a30d8dc8af91325959dbc5bff79b9cee"

RPROVIDES:${PN} += "lexmark7000linux \
pbm2l7k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
