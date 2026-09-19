SUMMARY = "Perl support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Perl support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-perl-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "01a1cce9e85cd997b6af98a8f327cb3134788659197e6fa0f16c9bbc34c2bc70e2f6d0fda04914a485b4ec741058eff977b2343f1a1b0aafc36dbc9a508ab7c7"

RPROVIDES:${PN} += "config-freeradius-server-perl \
freeradius-server-perl"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl"

inherit rpm
