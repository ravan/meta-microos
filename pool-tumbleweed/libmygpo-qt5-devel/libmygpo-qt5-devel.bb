SUMMARY = "Qt Library that wraps the gpodder.net Web API"
DESCRIPTION = "libmygpo-qt5 is a Qt Library that wraps the gpodder.net Web API (http://wiki.gpodder.org/wiki/Web_Services/API_2) \
 \
v1.0 wraps nearly every Request from the gpodder.net API except: \
- Simple API Calls Downloading subscription Lists & Uploading subscription Lists \
- Retrieving Subscription Changes (you should use 'Retrieving Updates for a given Device' instead)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmygpo-qt5-devel-1.1.0-3.6.aarch64.rpm"
RPM_HASH = "644eb16a9e2100a0e2c0c39a6c010e7560ed399ff89cf4f8ef0dc096a64d7b26913ff9d5bde8076016fc1fc1b935ab156743258f6b5bd3cd410e17d2c1d38c7c"

RPROVIDES:${PN} += "cmake-Mygpo-qt5 \
libmygpo-qt5-devel \
pkgconfig-libmygpo-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmygpo-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
