SUMMARY = "Network Monitoring Tool"
DESCRIPTION = "Argus is a network monitoring tool. \
 \
Documentation can be found in /usr/share/doc/packages/argus."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-3.0.8.3-4.10.aarch64.rpm"
RPM_HASH = "337c0abb0f5a4751da67617208f181cd2871f3b2570b58a4b3d22f0a0184d907c1c97045aaa397018d04852242aeba5a024bcc3a3b3eeeb2bef3128a113c051e"

RPROVIDES:${PN} += "argus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
