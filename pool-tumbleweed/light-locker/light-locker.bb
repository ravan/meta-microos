SUMMARY = "A simple locker using LightDM"
DESCRIPTION = "light-locker is a simple locker that aims to have simple, sane, secure \
defaults and be well integrated with the desktop while not carrying any \
desktop-specific dependencies. \
It relies on LightDM for locking and unlocking your session via systemd."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "light-locker-1.9.0-1.26.aarch64.rpm"
RPM_HASH = "0aa82ffd7a60f43203446cbebf3a10575242b5f0c76bb2346cc647b25a9e36f040fd0c5aad71df5309fa9f3603156a7e8a12d8d6d7c75e9264e5f9f504d11c94"

RPROVIDES:${PN} += "light-locker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
lightdm"

inherit rpm
