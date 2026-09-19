SUMMARY = "Intelligent Pinyin engine based on libpinyin for IBus"
DESCRIPTION = "It includes a Chinese Pinyin input method and a Chinese ZhuYin (Bopomofo) input \
method based on libpinyin for IBus."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.5"

RPM_NAME = "ibus-libpinyin-1.16.5-3.6.aarch64.rpm"
RPM_HASH = "944c6539475971975b9eaeb83876fb72b45204d477ef9e4c35978d3052f6be069e63aa215ec6d510ac60fdcdb0ae6e44918995ba4dd76bda3a45f86b6360d393"

RPROVIDES:${PN} += "ibus-libpinyin \
locale-ibus-zh-CN;zh-SG"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
liblua5.4.so.5 \
libnotify.so.4 \
libopencc.so.1.2 \
libpinyin.so.15 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
python3-base \
python3-gobject-Gdk"

inherit rpm
