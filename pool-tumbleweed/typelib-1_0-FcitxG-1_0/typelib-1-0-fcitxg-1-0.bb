SUMMARY = "Introspection bindings for fcitx5"
DESCRIPTION = "This package provides the GObject Introspection bindings for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "typelib-1_0-FcitxG-1_0-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "9bd8586cacbc4beff304a9bff05c156f568b53407193057c74e0f20958df058a49cfa04414c3201750433760ee6a5fff08e37f6f44570983bbd0e62a893c8f20"

RPROVIDES:${PN} += "typelib-1-0-Fcitx-1-0 \
typelib-1-0-FcitxG-1-0 \
typelib-FcitxG"

RDEPENDS:${PN} += "libFcitx5GClient.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
