SUMMARY = "SvxLink - A general purpose voice services system"
DESCRIPTION = "The SvxLink server is a general purpose voice services system for ham radio use. \
Each voice service is implemented as a plugin called a module. Some examples of \
voice services are: Help system, Simplex repeater, EchoLink connection. \
 \
The core of the system handle the radio interface and is quite flexible as well. \
It can act both as a simplex node and as a repeater controller."
LICENSE = "GPL-2.0-only"

PV = "1.10.1"

RPM_NAME = "svxlink-server-1.10.1-7.1.aarch64.rpm"
RPM_HASH = "271429c398721a5f176a26ee61b798c808b01af49704c3eb2050c7232d337674cf87842f75182b2d219446bd78ffabe0578c6727442462e8589716117ebeb6de"

RPROVIDES:${PN} += "config-svxlink-server \
svxlink-server"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasyncaudio.so.1.9 \
libasynccore.so.1.9 \
libasynccpp.so.1.9 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libecholib.so.1.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgpiod.so.3 \
libgsm.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libpopt.so.0 \
libsigc-2.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtcl8.6.so \
logrotate \
shadow"

inherit rpm
