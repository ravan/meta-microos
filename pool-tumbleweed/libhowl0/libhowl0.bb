SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libhowl0-0.8-45.2.aarch64.rpm"
RPM_HASH = "2de034cb4cdd4a008178794fa2eef6d2aa612d6f67b63558ab450ea540da4793909d74d7066dba2699bc49824e808406f27b066a9f16dac00d444806adf790e4"

RPROVIDES:${PN} += "avahi-compat-howl \
libhowl.so.0 \
libhowl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
