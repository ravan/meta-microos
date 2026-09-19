SUMMARY = "Ndesk-dbus-glib provides glib integration for NDesk.DBus"
DESCRIPTION = "Ndesk-dbus-glibl provides glib integration for NDesk.DBus"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "ndesk-dbus-glib-0.4.1-59.25.noarch.rpm"
RPM_HASH = "d0e551beda9d3ea214815748c586dcaeeeaccb8698ad11b78573bf5c2c9ad4902c1a9d3571077aaca2ac69221a736dca62817b216e737976ae2df032f44676ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-NDesk.DBus.GLib \
ndesk-dbus-glib"

RDEPENDS:${PN} += "mono-NDesk.DBus \
mono-mscorlib \
ndesk-dbus"

inherit rpm
