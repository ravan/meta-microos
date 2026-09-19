SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-client3-0.8-45.2.aarch64.rpm"
RPM_HASH = "48951486c44bda37b499c07be7f8ff6062c9d7e0911a929061385263d4deba093928286c73de3daccd63dfc3ab6d71b20dc4decae5a75abbb7ea5a5f17cdf6d7"

RPROVIDES:${PN} += "libavahi-client.so.3 \
libavahi-client3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
