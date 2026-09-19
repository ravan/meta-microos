SUMMARY = "Zhuyin engine based on libzhuyin for IBus"
DESCRIPTION = "This package includes a Chinese Zhuyin (Bopomofo) input method based \
on libzhuyin for IBus."
LICENSE = "GPL-2.0-only"

PV = "1.10.3"

RPM_NAME = "ibus-libzhuyin-1.10.3-3.6.aarch64.rpm"
RPM_HASH = "5835f050964d297b0d7f84aa56886557575cdbf92494ce732c78c96d19b259d6703ccd04415cdbc06c10583a691716c00b432b4f73cdbdb619952135bd6e65e8"

RPROVIDES:${PN} += "ibus-libzhuyin \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6 \
libzhuyin.so.15"

inherit rpm
