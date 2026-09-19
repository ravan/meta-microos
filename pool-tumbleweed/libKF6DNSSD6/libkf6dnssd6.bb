SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6DNSSD6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "04ee462b12dff4e41c27383b75a48aa4e26f2fdda491034c1d7896f37feffd2f76bbe058969aa9a73881a47c68e928be1245f27442ab82f587a7ef1bea2804fd"

RPROVIDES:${PN} += "libKF6DNSSD.so.6 \
libKF6DNSSD6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
