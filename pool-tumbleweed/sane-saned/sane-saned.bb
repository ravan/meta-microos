SUMMARY = "Sane network server"
DESCRIPTION = "Saned allows access to locally attached scanners over the network."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.3.1"

RPM_NAME = "sane-saned-1.3.1-3.11.aarch64.rpm"
RPM_HASH = "240ab8f681965ac903b0c8fad071ec39818c7be2c92bccf28659caf86d2b9da8d9ac92a9a773940329f330689c77c258e7d30e173c92eeb33a88666f61e6fb07"

RPROVIDES:${PN} += "config-sane-saned \
sane-backends-/usr/sbin/saned \
sane-saned"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libsane.so.1"

inherit rpm
