SUMMARY = "Introspection bindings for lunar-calendar"
DESCRIPTION = "This package contains the introspection bindings for the lunar-calendar library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "typelib-1_0-LunarCalendar-3_0-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "c92d6da7d6328ee2b461e68eadfea38b9fa1523cb7eb3cce902edc23d9df593c35b2054544981500300df81909632c8f735b74ad3e890a7a3651a79e1425ad54"

RPROVIDES:${PN} += "locale-patterns-gnome-gnome-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-mate-mate-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-xfce-xfce-zh-CN;zh-SG;zh-TW;zh-HK \
typelib-1-0-LunarCalendar-3-0 \
typelib-LunarCalendar"

RDEPENDS:${PN} += "liblunar-calendar-3.0.so.1 \
lunar-calendar \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-LunarDate \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
