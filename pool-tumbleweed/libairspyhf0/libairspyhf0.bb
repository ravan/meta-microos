SUMMARY = "Driver for Airspy HF+"
DESCRIPTION = "Library to run Airspy HF+ SDR receiver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libairspyhf0-1.6.8-4.7.aarch64.rpm"
RPM_HASH = "923d2007d4c0648c368569b9de99ec8a4afd665fe673a0dee30d56d55d3c439f8567e7d14dea6c29ef5c3cf259e7233a2d1f0d8876b37f192c3a162f624dbf7f"

RPROVIDES:${PN} += "libairspyhf.so.0 \
libairspyhf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspyhf-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm
