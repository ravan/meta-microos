SUMMARY = "Chinese Lunar calendar introspection bindings"
DESCRIPTION = "Introspection bindings for Chinese Lunar calendar for use in Gnome Shell"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "typelib-1_0-LunarDate-3_0-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "36d09d00778dfa5b4a6b988d4cf7765345b1f7eb9da20c74f46c8ad68c09a04d814b86264e0a93eb3ec4e42d458e33e60681993eea6e67b8dfd8d09656f60321"

RPROVIDES:${PN} += "locale-patterns-gnome-gnome-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-mate-mate-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-xfce-xfce-zh-CN;zh-SG;zh-TW;zh-HK \
typelib-1-0-LunarDate-3-0 \
typelib-LunarDate"

RDEPENDS:${PN} += "liblunar-date-3.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
