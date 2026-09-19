SUMMARY = "A caching DNS proxy for small networks or dialin accounts"
DESCRIPTION = "pdnsd is a proxy DNS daemon with permanent (disk-)cache and the ability \
to serve local records. It is designed to detect network outages or hangups \
and to prevent DNS-dependent applications like Netscape Navigator from hanging. \
 \
The original author of pdnsd is Thomas Moestl, but pdnsd is no longer maintained \
by him. This is an extensively revised version by Paul A. Rombouts. \
For a description of the changes see http://www.phys.uu.nl/~rombouts/pdnsd.html \
and the file README.par in /usr/share/doc/packages/pdnsd-doc."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9a"

RPM_NAME = "pdnsd-1.2.9a-12.12.aarch64.rpm"
RPM_HASH = "3d151cfea516827f819789832fa73744cfb6b777e298cf330eb21ce9649111528645d2145e9bc1cf08d2b2d678b13c760a01fb0f6c0ba7da6ca7f2ce776c2cc4"

RPROVIDES:${PN} += "config-pdnsd \
pdnsd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-pdns \
ld-linux-aarch64.so.1 \
libc.so.6 \
user-pdns"

inherit rpm
