SUMMARY = "Converts GPS waypoint, route and track data from one format type to another"
DESCRIPTION = "GPSBabel converts waypoints, tracks, and routes from one format to \
another, whether that format is a common mapping format like Delorme, \
Streets and Trips, or even a serial upload or download to a GPS unit \
such as those from Garmin and Magellan. By flattening the Tower of \
Babel that the authors of various programs for manipulating GPS data \
have imposed upon us, it returns to us the ability to freely move our \
own waypoint data between the programs and hardware we choose to use. \
 \
It contains extensive data manipulation abilities making it a \
convenient for server-side processing or as the backend for other \
tools. \
 \
It does not convert, transfer, send, or manipulate maps. We process \
data that may (or may not be) placed on a map, such as waypoints, \
tracks, and routes."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "gpsbabel-1.10.0-3.2.aarch64.rpm"
RPM_HASH = "30d350e009fef13439cca7a67d0800b56f90e8a8efecf7fe2dfaa1c42dcc34dc8cee19e0f872f20e743290bbe90d2e86a67b6da1e8bbc3ab0b5f26e750c4f567"

RPROVIDES:${PN} += "gpsbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libshp.so.4 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
