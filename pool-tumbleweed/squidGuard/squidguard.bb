SUMMARY = "Filter plugin for squid"
DESCRIPTION = "SquidGuard is a filter, redirector, and access controller plugin for squid. \
It lets you define multiple access rules with different restrictions for \
different user groups on a squid cache. SquidGuard uses squid's standard \
redirector interface."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-1.6.0-3.5.aarch64.rpm"
RPM_HASH = "a055bdf2c8bc903814b4e76b3f484dd46fd2c5d46a9f9601d5eb6fed274f47bc778531278344e40a65a857906225b25d81abb3caf3cf19653c8b13da56ee55f1"

RPROVIDES:${PN} += "config-squidGuard \
squidGuard"

RDEPENDS:${PN} += "/usr/bin/perl \
group-squid \
http-proxy \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libldap.so.2 \
libmariadb.so.3 \
user-squid"

inherit rpm
