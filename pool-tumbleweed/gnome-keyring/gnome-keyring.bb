SUMMARY = "GNOME Keyring"
DESCRIPTION = "The GNOME Keyring is a daemon in the session, similar to ssh-agent, \
and other applications can use it to store passwords and other \
sensitive information. \
 \
The program can manage several keyrings, each with its own master \
password, and there is also a session keyring which is never stored to \
disk, but forgotten when the session ends."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "gnome-keyring-50.0-3.2.aarch64.rpm"
RPM_HASH = "e6fdb2c60a3a83f3eddb25f300c133e18e57fabe553f77bb6fc6eca7361cdfe0a554010d6a184c4e553f445adfb78568872c31b5d429f85fb994519c13c4e1f5"

RPROVIDES:${PN} += "dbus-org.freedesktop.secrets \
dbus-org.gnome.keyring \
gnome-keyring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgck-modules-gnome-keyring \
libgcr-base-3.so.1 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
