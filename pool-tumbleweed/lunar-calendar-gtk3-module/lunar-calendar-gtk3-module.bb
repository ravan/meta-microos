SUMMARY = "The lunar-calendar libraries -- GTK+ 3 Module"
DESCRIPTION = "This package contains a GTK+ 3 module of lunar-calendar. Calendar applications \
base on GTK3 can display Chinese Lunar calendar by this module."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-calendar-gtk3-module-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "b3ebea7bbf499901df362fad189b376376e33786ff12317babb77cfdf71704485c90fbd5e1705931be0277aaec1f686c626b0b112383c60c580a00ad140a1d82"

RPROVIDES:${PN} += "config-lunar-calendar-gtk3-module \
liblunar-calendar-module.so \
locale-patterns-gnome-gnome-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-mate-mate-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-xfce-xfce-zh-CN;zh-SG;zh-TW;zh-HK \
lunar-calendar-gtk3-module"

RDEPENDS:${PN} += "libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblunar-calendar-3.0.so.1 \
lunar-calendar"

inherit rpm
