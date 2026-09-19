SUMMARY = "HP DriveGuard for SUSE"
DESCRIPTION = "HP DriveGuard for SUSE. Can protect hard disks on HP laptops by \
spinning them down when shaking or free-fall is detected."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.12"

RPM_NAME = "hp-drive-guard-0.3.12-29.5.aarch64.rpm"
RPM_HASH = "fb3d50eaa54e82040b3d710884b93a53ae8c8c55219ca6c23ce59f3aa2728406af20da5d0cea0ca2cfebdbc8fddee540a3884d9b0407e6c8015ccac426eb31ae"

RPROVIDES:${PN} += "config-hp-drive-guard \
hp-drive-guard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3 \
systemd"

inherit rpm
