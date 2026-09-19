SUMMARY = "A daemon for the Pantheon Desktop"
DESCRIPTION = "A daemon for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "8.5.0"

RPM_NAME = "pantheon-settings-daemon-8.5.0-1.4.aarch64.rpm"
RPM_HASH = "c98ea654deeafc762ad0cc3a0cdc954ebc8f2a4b4752910095fdf4ed52f846bdb27636aa45b2a7d7f06a4d194a13660a1330af344b3e3a98351733b465dde7b8"

RPROVIDES:${PN} += "pantheon-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfwupd.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgeoclue-2.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpackagekit-glib2.so.18"

inherit rpm
