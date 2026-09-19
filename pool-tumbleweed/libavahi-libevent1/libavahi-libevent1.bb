SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-libevent1-0.8-45.2.aarch64.rpm"
RPM_HASH = "9e4412171ca9ce8d9e40a5f3d570beb153b928592aeea3848d9d68e85dd34df7b46fc35c4e8c181e032952913efdd457422e446f16a8bcdd844e0ad70f009df8"

RPROVIDES:${PN} += "libavahi-libevent.so.1 \
libavahi-libevent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-common.so.3 \
libc.so.6 \
libevent-2.1.so.7"

inherit rpm
