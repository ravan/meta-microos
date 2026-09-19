SUMMARY = "TN3270 access library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this library \
provides a TN3270 virtual terminal widget for GTK 3. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "libv3270-5_5-5.5.0+git20241211-2.8.aarch64.rpm"
RPM_HASH = "fc6291f16eb161784df83563aab9fcfdef530a53fc13e0b81a24156c6727e7170a4e209bb471a4f28a6591f0fa630efa355c469c0e7cfd33d489ac88dd94e775"

RPROVIDES:${PN} += "libv3270-5-5 \
libv3270.so.5.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lib3270.so.5.5 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
