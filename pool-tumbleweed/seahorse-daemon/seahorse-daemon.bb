SUMMARY = "Daemon for PGP prompting by libcryptui"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "seahorse-daemon-3.12.2-12.7.aarch64.rpm"
RPM_HASH = "db1a57c9fe342265a031d66529faf895bf4639f0471717af1a10b4853313819adbbb0d34aad253fd4a392f9211b54b5c1e1c1e22eb746982313e2432371dd04e"

RPROVIDES:${PN} += "seahorse-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcryptui-data \
libcryptui.so.0 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libnotify.so.4"

inherit rpm
