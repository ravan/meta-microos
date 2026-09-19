SUMMARY = "System user for libvirt-dbus"
DESCRIPTION = "System user for libvirt-dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "system-user-libvirt-dbus-1.4.1-3.18.noarch.rpm"
RPM_HASH = "7c51da46039c69fc9b4bdda6d8ed50dc9bff5f7680d148fdebb34ef8c79355d7adb38e43d0464caa4eb3368d153ee4563cb307fbd06867e990524f8994ba4f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-libvirtdbus \
system-user-libvirt-dbus \
user-libvirtdbus"

RDEPENDS:${PN} += "/usr/bin/sh \
group-libvirt \
sysuser-shadow"

inherit rpm
