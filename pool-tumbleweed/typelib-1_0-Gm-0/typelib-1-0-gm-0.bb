SUMMARY = "Some helpers for glib based environments on mobile devices"
DESCRIPTION = "gmobile carries some helpers for glib based environments on mobile devices. \
 \
Some of those parts might move to glib or libgnome-desktop eventually. It can be used as a shared library or git submodule. \
There aren't any API stability guarantees at this point in time."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "typelib-1_0-Gm-0-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "be9275f7661faaa1b05dd4fb3d21ddcb739c07c7aec10a18bc22d36c91e0dba36359b2794d71f2e44b5944ea7370db4fdc60fa568e3acbf3969e039ce389a37a"

RPROVIDES:${PN} += "typelib-1-0-Gm-0 \
typelib-Gm"

RDEPENDS:${PN} += "libgmobile.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
