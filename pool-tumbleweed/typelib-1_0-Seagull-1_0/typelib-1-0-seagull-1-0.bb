SUMMARY = "Introspection file for seagull"
DESCRIPTION = "Introspection file for seagull."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-Seagull-1_0-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "351dfc2ecf2545250e4d755bcca5e3a891f0484e32db1d4e338e7c8b66ff3321b806a85eee872c9eebaca7be8542d3631024762c3c6e8f043d0477f1ab2ae91d"

RPROVIDES:${PN} += "typelib-1-0-Seagull-1-0 \
typelib-Seagull"

RDEPENDS:${PN} += "libseagull.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
