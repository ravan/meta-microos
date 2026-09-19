SUMMARY = "Daemon for feeding entropy into the random pool"
DESCRIPTION = "The haveged daemon feeds the Linux entropy pool with random \
numbers generated from hidden processor state. \
 \
For more information, see http://www.issihosts.com/haveged/ ."
LICENSE = "GPL-3.0-only"

PV = "1.9.21"

RPM_NAME = "haveged-1.9.21-1.3.aarch64.rpm"
RPM_HASH = "7c9b485e62b0a53dd9a1b954e79225542a30d24e2e07cb94d2de25d548f8d558482f1fcf452e8f3d90d2bdd769cc2bda7b1ffbddf64a96411cabe568923431ea"

RPROVIDES:${PN} += "haveged"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhavege.so.2 \
systemd"

inherit rpm
