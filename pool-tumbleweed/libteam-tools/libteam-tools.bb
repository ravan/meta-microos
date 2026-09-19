SUMMARY = "Utilities for controlling team network devices"
DESCRIPTION = "This package contains frontends to libteam that allow changing \
the (team-specific) properties of team devices. \
(The general configuration of network devices can be done \
through using iproute.) \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32"

RPM_NAME = "libteam-tools-1.32-2.10.aarch64.rpm"
RPM_HASH = "d8758065feb9cb3bbbb3107af0d5f1436a4e0c35492f8026b6f3493830c3c0be3f438703c46a7b408021f692d0ea59ce3d466b9715ffa89d5eec872e263c0fbe"

RPROVIDES:${PN} += "config-libteam-tools \
libteam-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdaemon.so.0 \
libdbus-1.so.3 \
libjansson.so.4 \
libteam.so.5 \
libteamdctl.so.0"

inherit rpm
