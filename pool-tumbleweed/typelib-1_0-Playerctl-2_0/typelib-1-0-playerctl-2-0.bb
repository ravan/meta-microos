SUMMARY = "GObject Introspection interface description for libplayerctl"
DESCRIPTION = "This package provides the GObject Introspection bindings libplayerctl, \
enabling usage in programming languages that support it."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "typelib-1_0-Playerctl-2_0-2.4.1-1.21.aarch64.rpm"
RPM_HASH = "382fdd64e585b28c0269ee99d267e1c1081d575c65952bdbb835586c27048cb8234e136ab42ef6cd694cb9874e8cd9aa6af7b9e12ee921bbf83abb8854c35dfa"

RPROVIDES:${PN} += "typelib-1-0-Playerctl-2-0 \
typelib-Playerctl"

RDEPENDS:${PN} += "libplayerctl.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
