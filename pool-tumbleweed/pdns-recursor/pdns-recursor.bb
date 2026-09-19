SUMMARY = "Modern, advanced and high performance recursing/non authoritative nameserver"
DESCRIPTION = "PowerDNS Recursor is a non authoritative/recursing DNS server. Use this \
package if you need a dns cache for your network. \
 \
 \
Authors: \
-------- \
    http://www.powerdns.com"
LICENSE = "GPL-2.0-or-later"

PV = "5.2.5"

RPM_NAME = "pdns-recursor-5.2.5-2.10.aarch64.rpm"
RPM_HASH = "ba301bed17a41f0424d77f780efb4f824fd5c6f62d22673de784a984e978a167b7507c20b6a7419c217892d528937898cc54359b7cafd54b174248cc0f6df633"

RPROVIDES:${PN} += "bundled-json11 \
bundled-luawrapper \
bundled-probds \
bundled-protozero \
bundled-yahttp \
config-pdns-recursor \
pdns-recursor"

RDEPENDS:${PN} += "/usr/bin/sh \
group-pdns \
ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfstrm.so.0 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libsodium.so.26 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
pdns-common \
shadow"

inherit rpm
