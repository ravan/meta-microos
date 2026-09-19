SUMMARY = "Allows to quickly set desktop background"
DESCRIPTION = "Caja-share allows you to quickly set desktop background wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-wallpaper-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "d870a2636882a97aab461f0764fc4f658bf3e49e61cf88586e954138c3f0478b5b946d97aa7d22a2cd3fd98958c24421ba8a340b6d288261b198a8b2e5480f8b"

RPROVIDES:${PN} += "caja-extension-wallpaper \
caja-wallpaper \
libcaja-wallpaper.so"

RDEPENDS:${PN} += "caja \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
