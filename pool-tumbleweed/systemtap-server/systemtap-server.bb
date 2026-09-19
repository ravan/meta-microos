SUMMARY = "Systemtap server"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the server component of systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-server-5.5-1.3.aarch64.rpm"
RPM_HASH = "e6918c4eeed7e7e27368631709229ad8cc19259c5d00d71089a81a14ac0efaeaf6a6160df1fd136dbbd56907bb8b9efc592a6f8e09f321257cbec105788d0135"

RPROVIDES:${PN} += "systemtap-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
avahi \
avahi-utils \
coreutils \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libnspr4.so \
libnss3.so \
libssl3.so \
libstdc++.so.6 \
mozilla-nss-tools \
systemtap \
unzip \
zip"

inherit rpm
