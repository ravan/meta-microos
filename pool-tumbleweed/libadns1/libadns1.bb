SUMMARY = "Advanced DNS resolver client library"
DESCRIPTION = "Libadns is an advanced, easy to use, asynchronous-capable DNS resolver \
client library for C (and C++) programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.2"

RPM_NAME = "libadns1-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "79fed2875d503fc6d0ea07645621fe4284893f34140e07543e00903cea0e9bd85eb6fe647da8cbe6caf36c4ea33056bb7c48f708d8ac8a8ed6284215ec3218bb"

RPROVIDES:${PN} += "libadns \
libadns.so.1 \
libadns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
