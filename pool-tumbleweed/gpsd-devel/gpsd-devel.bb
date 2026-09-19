SUMMARY = "Client libraries in C and Python for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides C header files for the gpsd shared libraries that \
manage access to a GPS for applications and debugging tools. You will \
need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "gpsd-devel-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "1249dab36884b368d6e0063727904f829f409b116875d6c40fbb0b8b01add80bb288fb83aaef21ca0f5b2ddcd59d81130163527227db9c907bb15e622a44009f"

RPROVIDES:${PN} += "gpsd-devel \
pkgconfig-libgps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
/usr/bin/sh \
gpsd \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgps32 \
libm.so.6 \
libusb-1.0.so.0 \
pkgconfig \
python3-curses \
python3-gpsd"

inherit rpm
