SUMMARY = "D-Bus service for libddcutil VESA DDC Monitor Virtual Control Panel"
DESCRIPTION = "ddcutil-service is D-Bus service wrapper for libddcutil which \
implements the VESA DDC Monitor Control Command Set. In general, \
most things that can be controlled using a monitor's on-screen \
display can be controlled by this service."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.15"

RPM_NAME = "ddcutil-service-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "c5626e9d6cc1440efc7fb091367d1b17024323469fd8c3af63882e62eaa08ef5aa72af70f1cbd110193612994e00d7271904c2dadaddf696002ee99f052765fb"

RPROVIDES:${PN} += "ddcutil-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
dbus-1 \
libc.so.6 \
libddcutil.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
