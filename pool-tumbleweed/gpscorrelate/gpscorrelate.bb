SUMMARY = "Tool for setting EXIF GPS data"
DESCRIPTION = "GPS Correlate takes a GPS track stored by any of a number of \
GPS devices and phone apps and correlates the time stamp of \
a digital photo with the location of the track at that same \
moment. The location of the image is then stamped directly \
into the image file using the appropriate EXIF GPS tags. The \
resulting image then contains not just the time the photo was \
taken but its exact location, too. The location is used by \
various other applications and services (such as Google Photos) \
to display a map of where the photo was taken. \
 \
This package contains the command line tool and the documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "gpscorrelate-2.3-1.1.aarch64.rpm"
RPM_HASH = "668f5ab5073fa7042034167769427615034f1cf2416d6353ac110675982743f6727fe50d2219ce08dfef160e6fea2acc94858d88b0266b727ef003e1e66e31f8"

RPROVIDES:${PN} += "gpscorrelate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
