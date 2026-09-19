SUMMARY = "GTK+ application to allow you to keep a diary of your life"
DESCRIPTION = "Almanah Diary is a small application to ease the management of an encrypted \
personal diary. It's got good editing abilities, including text formatting \
and printing. Evolution tasks and appointments will be listed to ease the \
creation of diary entries related to them. At the same time, you can create \
diary entries using multiple events."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.4"

RPM_NAME = "almanah-0.12.4-2.5.aarch64.rpm"
RPM_HASH = "4116e921fb4cb31e2d168c4f82a9b8991cd50c2bd9a916651e374c3710c38fa92b5b4c30a83b29f629e5e25d22146df64af148804096333f5b7e5125c54666a8"

RPROVIDES:${PN} += "almanah"

RDEPENDS:${PN} += "evolution-data-server \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcryptui.so.0 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libgtkspell3-3.so.0 \
libical-glib.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsqlite3.so.0"

inherit rpm
