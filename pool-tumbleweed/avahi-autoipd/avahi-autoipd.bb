SUMMARY = "IPv4LL Service for Zeroconf and Bonjour"
DESCRIPTION = "avahi-autoipd is an implementation of Dynamic Configuration of IPv4 \
Link-Local Addresses. \
 \
avahi-autoipd doesn't depend on any other Avahi library, hence it makes \
sense to install it even if Avahi itself is not installed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-autoipd-0.8-45.2.aarch64.rpm"
RPM_HASH = "ec340cd0041d15d1ff0fcdb7bfcd63cf7fc68b65949996acfb7b04a627984e15350e9a06806d5391ff39bfb4ce06e0278da363fb9854953d680335f87a5062bc"

RPROVIDES:${PN} += "avahi-/usr/sbin/avahi-autoipd \
avahi-autoipd \
group-avahi-autoipd \
user-avahi-autoipd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaemon.so.0 \
sysuser-shadow"

inherit rpm
