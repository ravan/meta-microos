SUMMARY = "Example clients for gpsd"
DESCRIPTION = "xgps is a simple test client for gpsd with an X interface. It displays \
current GPS position/time/velocity information and (for GPSes that \
support the feature) the locations of accessible satellites. \
 \
xgpsspeed is a speedometer that uses position information from the GPS. \
It accepts an -h option and optional argument as for gps, or a -v \
option to dump the package version and exit. Additionally, it accepts \
-rv (reverse video) and -nc (needle color) options. \
 \
cgps resembles xgps, but without the pictorial satellite display.  It \
can run on a serial terminal or terminal emulator."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "gpsd-clients-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "1c4e6cad81de394a1b1ff21046f4d86a2030b7b9d6042eb66102f255921e10fb08e82f78c79e65a3b4785adc5a136e71815cf7e267ad95574a16405a05775668"

RPROVIDES:${PN} += "gpsd-clients"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libusb-1.0.so.0 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gpsd \
python3-serial \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk"

inherit rpm
