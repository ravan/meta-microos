SUMMARY = "GObject Introspection interface description for libmodulemd"
DESCRIPTION = "This package provides the GObject Introspection typelib interface \
for applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "typelib-1_0-Modulemd-2_0-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "15b987735e84091f36d1588b7ecd8ba597707877e1b4f95df4bc81849700adceca5abf4f939c5ae55e99d80334079599a32975abb2358f17ba8f75164a5bcd13"

RPROVIDES:${PN} += "typelib-1-0-Modulemd-2-0 \
typelib-Modulemd"

RDEPENDS:${PN} += "libmodulemd.so.2 \
libmodulemd2 \
typelib-GLib \
typelib-GObject"

inherit rpm
