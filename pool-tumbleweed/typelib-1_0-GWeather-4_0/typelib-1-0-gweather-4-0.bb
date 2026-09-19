SUMMARY = "Introspection bindings for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
 \
This package provides the GObject Introspection bindings for the \
libgweather library."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "typelib-1_0-GWeather-4_0-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "58951da8204f9e490671aa4e60e7065c2e76ef3c598d6e34cd4c3ba851c89b81fe11cad8ef80c86a84c8a055c9b98599eccc8ea7e9d998e5eea23e501351217a"

RPROVIDES:${PN} += "typelib-1-0-GWeather-4-0 \
typelib-GWeather"

RDEPENDS:${PN} += "libgweather-4.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
