SUMMARY = "Client for One Drive Service for Linux"
DESCRIPTION = "OneDrive is a client for Microsoft file serving service"
LICENSE = "GPL-3.0-only"

PV = "2.5.11"

RPM_NAME = "onedrive-2.5.11-1.4.aarch64.rpm"
RPM_HASH = "7b219a3d5dfc7225abe53d21cb0ecfd62ffc824f8b603369739f6b02e9c277d7e0c518801ee76cbc18bbb1c372cb91b12f4966babce2079a5eb714f9a76bbab7"

RPROVIDES:${PN} += "config-onedrive \
onedrive"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcurl.so.4 \
libdbus-1-3 \
libdbus-1.so.3 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libnotify4 \
libphobos2-ldc-shared.so.112 \
libsqlite3.so.0"

inherit rpm
