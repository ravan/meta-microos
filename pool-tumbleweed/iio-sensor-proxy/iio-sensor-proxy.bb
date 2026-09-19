SUMMARY = "Proxy for IIO and input subsystems"
DESCRIPTION = "This proxy reads sensor data from the IIO subsystem and serves to \
the input subsystem"
LICENSE = "GPL-3.0-only"

PV = "3.9"

RPM_NAME = "iio-sensor-proxy-3.9-1.5.aarch64.rpm"
RPM_HASH = "ca78de8e29ed2c0626b2ce4b6b881f0372b6bd6a50384e77a6b78211448875beef61759a5007a03fe3b8f23ed569cfc1732b612128c3dc69c306d021399c72a8"

RPROVIDES:${PN} += "iio-sensor-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libm.so.6 \
libpolkit-gobject-1.so.0 \
systemd \
user-srvGeoClue"

inherit rpm
