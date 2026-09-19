SUMMARY = "TCP/IP swiss army knife"
DESCRIPTION = "A simple Unix utility which reads and writes data across network \
connections using TCP or UDP protocol. It is designed to be a reliable \
'back-end' tool that can be used directly or easily driven by other \
programs and scripts. At the same time it is a feature-rich network \
debugging and exploration tool, since it can create almost any kind of \
connection you would need and has several interesting built-in \
capabilities. \
 \
This package contains the OpenBSD rewrite of netcat, including support \
for IPv6, proxies, and Unix sockets."
LICENSE = "BSD-3-Clause"

PV = "1.229"

RPM_NAME = "netcat-openbsd-1.229-1.5.aarch64.rpm"
RPM_HASH = "455a49abc98f10df79ab00a7f71dd761c4a0bad12f28ce769c64978cbb0cca3e04a445110af1d6dee67236ee113ff2f1c682b76addbe38866e51f0856ee79146"

RPROVIDES:${PN} += "nc6 \
netcat \
netcat-openbsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libresolv.so.2"

inherit rpm
