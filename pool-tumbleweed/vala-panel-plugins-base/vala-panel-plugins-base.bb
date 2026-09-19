SUMMARY = "Plugins for vala-panel -- non-X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains main plugins for vala-panel: clock, \
launchbar, applications menu and so on."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-base-0.5.0-1.18.aarch64.rpm"
RPM_HASH = "cb519cd3415f81d3fa70ef6863d6bbd4c9ab6e633811bc5f69e66d2bd93fcb3556ec8dabebae9f427f398f3ed1810396ed5b2fee9b65314dd39296c33fe8d7ff"

RPROVIDES:${PN} += "libclock.so \
libcpu.so \
libdirmenu.so \
libkbled.so \
liblaunchbar.so \
libmenumodel.so \
libmonitors.so \
libseparator.so \
vala-panel-plugins-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libvalapanel.so.0"

inherit rpm
