SUMMARY = "A simple gtk-based command runner dialog with auto-complete"
DESCRIPTION = "A smaller and lighter-weight alternative to grun or gnome-run, with auto-completion and ~ expansion."
LICENSE = "ISC"

PV = "1.4w"

RPM_NAME = "gmrun-1.4w-1.10.aarch64.rpm"
RPM_HASH = "70861fec866250a77be65ac54854ba7d1802413513ffb453614a924b2dfd90b5452bf41698a2a3e1442bbf12053b0720eeff6cec919aaa3e0f5b6c1a79cd67da"

RPROVIDES:${PN} += "config-gmrun \
gmrun"

RDEPENDS:${PN} += "libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
