SUMMARY = "Service to broadcast wall messages via dbus"
DESCRIPTION = "Wall Broadcaster is a service which registers itself as session with \
systemd-logind, listens to it's TTY for wall messages and forwards \
them via D-BUS. Clients, e.g. for graphical desktops, can listen to it \
and display the messages to the user."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1+git20260806.19775bc"

RPM_NAME = "wall-broadcaster-0.4.1+git20260806.19775bc-1.1.aarch64.rpm"
RPM_HASH = "c38521e9e319b30b73cba22098b5d90f646256d48b106771d9b29de5c13f31c9ec6a56e663b3393a5f60fcac6ff282ed8ed37471618e1fb6071dd7ef60015fbc"

RPROVIDES:${PN} += "wall-broadcaster"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
