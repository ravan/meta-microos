SUMMARY = "Base GObject Introspection Bindings"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.86.0"

RPM_NAME = "girepository-1_0-1.86.0-3.4.aarch64.rpm"
RPM_HASH = "38f2c3411a407ce78a060490ab989045fb47186ff136aa3e5603136e8f1189c1fd5ed603b144e7dfd613446605f977911dd7c98a014ff7f9950e3bcc35f0c9db"

RPROVIDES:${PN} += "girepository-1-0 \
typelib-DBus \
typelib-DBusGLib \
typelib-GIRepository \
typelib-GL \
typelib-Vulkan \
typelib-cairo \
typelib-fontconfig \
typelib-freetype2 \
typelib-libxml2 \
typelib-win32 \
typelib-xfixes \
typelib-xft \
typelib-xlib \
typelib-xrandr"

RDEPENDS:${PN} += "libgirepository-1-0-1"

inherit rpm
