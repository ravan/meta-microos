SUMMARY = "Development files for the gSOAP toolkit"
DESCRIPTION = "This package contains the runtime development programs, include \
headers and development library symlinks for libgsoap."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.144"

RPM_NAME = "gsoap-devel-2.8.144-1.1.aarch64.rpm"
RPM_HASH = "38ce49863f71566188c305652cd2372353fc0e87ef303e6b3846c3447e4ef5889e25646436f41f1e968b5e362b10c17f5ca9d7063304cc91feac1a003ab6bba1"

RPROVIDES:${PN} += "gsoap-devel \
libgsoap-devel \
pkgconfig-gsoap \
pkgconfig-gsoap++ \
pkgconfig-gsoapck \
pkgconfig-gsoapck++ \
pkgconfig-gsoapssl \
pkgconfig-gsoapssl++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgsoapssl++-2.8.144.so \
libstdc++.so.6"

inherit rpm
