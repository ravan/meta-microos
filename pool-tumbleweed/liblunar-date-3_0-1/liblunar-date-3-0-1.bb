SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "liblunar-date-3_0-1-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "9527c579f779fb921490d251f734be2e15e39d660f52dcd42aceb92f5a32f4f5f55f5c45d08f6e5321ceaa8f123f7eccd59172e43c3fde7e31d0df0e678f13d4"

RPROVIDES:${PN} += "liblunar-date-3-0-1 \
liblunar-date-3.0.so.1 \
locale-patterns-gnome-gnome-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-mate-mate-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-xfce-xfce-zh-CN;zh-SG;zh-TW;zh-HK"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
