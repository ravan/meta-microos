SUMMARY = "Internet streaming media toolkit"
DESCRIPTION = "MistServer is a streaming media toolkit for over-the-top media \
services (internet streaming) ideal for developers and system integrators."
LICENSE = "Unlicense"

PV = "3.11.1"

RPM_NAME = "MistServer-3.11.1-1.1.aarch64.rpm"
RPM_HASH = "7a3e158e124b7a2ae74e0b221c7f3a9325330427542c2ce3b8319e095fce610368ee6ba8d90e77fc6b412df3221066f6d3739afd86516f1492dd7b6d142ca9e7"

RPROVIDES:${PN} += "MistServer \
config-MistServer \
group-mistserver \
libmist-srt.so \
libmist.so \
user-mistserver"

RDEPENDS:${PN} += "/usr/bin/sh \
group-video \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
librist.so.4 \
libsrt.so.1.5 \
libsrtp2.so.1 \
libstdc++.so.6 \
libusrsctp.so.2 \
sysuser-shadow"

inherit rpm
