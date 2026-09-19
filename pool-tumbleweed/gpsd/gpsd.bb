SUMMARY = "Service daemon for mediating access to a GPS"
DESCRIPTION = "gpsd is a service daemon that mediates access to a GPS sensor connected \
to the host computer by serial or USB interface, making its data on the \
location/course/velocity of the sensor available to be queried on TCP \
port 2947 of the host computer.  With gpsd, multiple GPS client \
applications (such as navigational and wardriving software) can share \
access to a GPS without contention or loss of data.  Also, gpsd \
responds to queries with a format that is substantially easier to parse \
than NMEA 0183.  A client library is provided for applications. \
 \
After installing this RPM, gpsd will automatically connect to USB GPSes \
when they are plugged in and requires no configuration.  For serial \
GPSes, you will need to start gpsd by hand.  Once connected, the daemon \
automatically discovers the correct baudrate, stop bits, and protocol. \
The daemon will be quiescent when there are no clients asking for \
location information, and copes gracefully when the GPS is unplugged \
and replugged."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "gpsd-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "404e7a00a0456076f548984b885d20317b44d131358d2d0a182bcd8e468a350b7cf3f902a2d083603611bfec567ed899da26d2700aaf1d0534b791719c42cd05"

RPROVIDES:${PN} += "gpsd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libm.so.6 \
libusb-1.0.so.0 \
systemd \
udev"

inherit rpm
