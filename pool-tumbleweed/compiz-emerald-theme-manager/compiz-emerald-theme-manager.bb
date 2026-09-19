SUMMARY = "Graphical theme manager for Emerald"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz. \
 \
This package contains a graphical theme manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-theme-manager-0.8.18-2.25.aarch64.rpm"
RPM_HASH = "455b4fbf125012b039df8291875c5a95ef52ec0e3ac60924e30b2c94fc90fc60266c773062377ff40e0efc8bc4042bb48807072bc03616a6fe02deefa64c9d68"

RPROVIDES:${PN} += "compiz-emerald-theme-manager"

RDEPENDS:${PN} += "compiz-emerald \
ld-linux-aarch64.so.1 \
libc.so.6 \
libemeraldengine.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
