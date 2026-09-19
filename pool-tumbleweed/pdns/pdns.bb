SUMMARY = "Authoritative-only nameserver"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. Furthermore, PowerDNS \
interfaces with almost any database."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "58d88b1ad71041cb697cb2059222d55b1db63ec8398f67bc3e60064476c295f6aa0d3526ae5992f9d734cac93fa7669e6a097f10a2733203865af9af67f9941b"

RPROVIDES:${PN} += "bundled-ipcrypt \
bundled-json11 \
bundled-lmdb-safe \
bundled-luawrapper \
bundled-protozero \
bundled-yahttp \
config-pdns \
libbindbackend.so \
libpipebackend.so \
pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
group-pdns \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libp11-kit.so.0 \
libsodium.so.26 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libyaml-cpp.so.0.9 \
pdns-common"

inherit rpm
