SUMMARY = "Switchboard Notifications Plug"
DESCRIPTION = "Configure which apps should be allowed to show notifications. \
A GModule plugin for Switchboard that configures gsettings keys related to \
the Notifications plugin for Gala."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.1"

RPM_NAME = "switchboard-plug-notifications-8.0.1-1.4.aarch64.rpm"
RPM_HASH = "7073c8494fece2ce86da952844960b712f3983779242294f2defbab7a2c964c06b13b820d36dbc465d150bb2994696593ed6b0fe79671eeddd0606e533e8fbe4"

RPROVIDES:${PN} += "libnotifications.so \
switchboard-plug-notifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
