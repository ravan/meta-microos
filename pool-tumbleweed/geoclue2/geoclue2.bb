SUMMARY = "GeoLocation Framework"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "geoclue2-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "dce076356ca6834217b6801c0251747b95646abba085e8248a07fa86a426beb671ae1b42d3217a5402ff780a3ca0dc7e3dd03c4be75da85674d9bf678a055965"

RPROVIDES:${PN} += "config-geoclue2 \
dbus-org.freedesktop.GeoClue2 \
geoclue2 \
libgeoclue-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnotify.so.4 \
libsoup-3.0.so.0 \
systemd \
user-srvGeoClue"

inherit rpm
