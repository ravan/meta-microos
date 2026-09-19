SUMMARY = "Introspection Bindings"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
xplayer-plparser library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-XplayerPlParser-1_0-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "46192b66cb0ecec4299ecd613ebfc715b24b726deda19d4cb8462e30a5b19e5c942142fdafdf8add7d049766fafa44f131ad889c7447a0fcbaaaa40909cc32c0"

RPROVIDES:${PN} += "typelib-1-0-XplayerPlParser-1-0 \
typelib-XplayerPlParser"

RDEPENDS:${PN} += "libxplayer-plparser.so.18 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
xplayer-plparser"

inherit rpm
