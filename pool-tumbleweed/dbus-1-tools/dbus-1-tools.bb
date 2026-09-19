SUMMARY = "Tools that go along with dbus"
DESCRIPTION = "D-Bus is a message bus system, these are some of the tools that go along \
with it."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-tools-1.14.10-5.5.aarch64.rpm"
RPM_HASH = "d6f413c4ce6c4ee608042fba2496e3305e0371526d6f548e481557e464c6986625c2079e269983e66e6e24e5bdf8ced1c36130ce2ad60d97334335ac7a50ce5b"

RPROVIDES:${PN} += "dbus-1-/usr/bin/dbus-monitor \
dbus-1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
