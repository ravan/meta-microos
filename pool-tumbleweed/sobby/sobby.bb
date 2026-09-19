SUMMARY = "Stand-alone obby server"
DESCRIPTION = "sobby is a stand-alone obby server. It currently runs under Unix-like \
platforms only."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "sobby-0.4.8-12.6.aarch64.rpm"
RPM_HASH = "ad9e7d46224434463aa19130bfacb4c204832871fa2983acd1302b26862aecf8031e373a4c57048f96b04dbab3015594e94c4579649f5a6346c874e607e8dad4"

RPROVIDES:${PN} += "sobby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-glib.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libnet6-1.3.so.0 \
libobby-0.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
