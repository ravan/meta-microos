SUMMARY = "Plug to configure the date and time for the user"
DESCRIPTION = "Date, time and timezone management for Elementary through a Switchboard plug."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "switchboard-plug-datetime-8.1.0-1.7.aarch64.rpm"
RPM_HASH = "ba7b40c3eb9855c9fc7aba84bbc8dbad6538031ae309c0e86b1688548722657693d48515865b254dd1ca73001301a22ca14615a6c0ed52e81f05e0fdf7b16ce2"

RPROVIDES:${PN} += "libdatetime.so \
switchboard-plug-datetime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libical-glib.so.3 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
