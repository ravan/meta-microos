SUMMARY = "Japanese Kana to Kana-Kanji converter -- Introspection bindings"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the GObject Introspection bindings for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20240902.ce17a35"

RPM_NAME = "typelib-1_0-kkc-1_0-0.3.6~git20240902.ce17a35-4.3.aarch64.rpm"
RPM_HASH = "cc2aeea796fa13ef2c1e165817095e1a1f2671fc73b3d05002e8a25455e62955ebd999d66b74c735fe2e8e77742530f7520b4686b9754d0ef77dcc6f69f86977"

RPROVIDES:${PN} += "typelib-1-0-kkc-1-0 \
typelib-Kkc"

RDEPENDS:${PN} += "libkkc.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-Json"

inherit rpm
