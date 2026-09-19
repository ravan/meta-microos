SUMMARY = "A glib/gio-based lib used to develop file managers"
DESCRIPTION = "A glib/gio-based library providing some file management utilities and \
related-widgets missing in gtk+/glib. This is the core of PCManFM. The \
library is desktop independent (not LXDE specific) and has clean API. \
It can be used to develop other applications requiring file management \
functionality. For example, you can create your own file manager with \
facilities provided by libfm."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "d84eeb3000fe350df86262473dbe9989b5cfbacec87191dce3bac8878f98bf14d10d0a2d083a35ed1ea33dc766f95462953c7f356f9eddfbae40dfe966c7a59a"

RPROVIDES:${PN} += "config-libfm \
libfm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfm-extra.so.4 \
libfm-gtk3.so.4 \
libfm.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmenu-cache.so.3"

inherit rpm
