SUMMARY = "MATE Desktop panel applet to display sensor readings"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-applet-sensors-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "fcd5bc9be811aa0f3ca8b551fdfcb3e20210fc899ca783ea06893f7a9c19d82c5bcb5446cf39aac41b21f19a9dbc3ff9433515e2773fbe0572fc689bf28ea0f5"

RPROVIDES:${PN} += "libacpi.so \
libhddtemp.so \
libi8k.so \
libibm-acpi.so \
liblibsensors.so \
libmbmon.so \
libomnibook.so \
libpmu-sys.so \
libsmu-sys.so \
libsonypi.so \
libudisks2.so \
mate-applet-sensors \
mate-sensors-applet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1 \
libmate-sensors-applet-plugin.so.0 \
libnotify.so.4 \
libsensors.so.4 \
mate-panel"

inherit rpm
