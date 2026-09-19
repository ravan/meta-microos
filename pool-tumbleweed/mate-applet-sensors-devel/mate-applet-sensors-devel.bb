SUMMARY = "Development files for mate-sensors-applet"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-applet-sensors-devel-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "fef840f3579d90a3e03286b7570e2aa88b67259b384e7fd212da626353acf176bffad83c0b79304e14e99cf4f92029123dbc6646a03fecb52113650c56776415"

RPROVIDES:${PN} += "mate-applet-sensors-devel \
mate-sensors-applet-devel"

RDEPENDS:${PN} += "libmate-sensors-applet-plugin0"

inherit rpm
