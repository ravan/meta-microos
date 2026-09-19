SUMMARY = "EDID over DDC Detection"
DESCRIPTION = "Provide EDID detection through display data channel (DDC) communication."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmDDC0-0.5.4-1.32.aarch64.rpm"
RPM_HASH = "68e04f1fa565be1224b534cc5ac3bff58ced84ad3a78912079f72eb52c63f045c410f898815c61bfec252f1fc1b8f377c0e42e6d7ef50d4fdedc7d5e392b6081"

RPROVIDES:${PN} += "libXcmDDC.so.0 \
libXcmDDC0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
