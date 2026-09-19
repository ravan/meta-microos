SUMMARY = "The GameMode daemon required by GameMode enabled games"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
The GameMode daemon is installed as a D-Bus Service and will start \
automatically on first access by a client."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "gamemoded-1.8.2-1.9.aarch64.rpm"
RPM_HASH = "d49213dfd03794aa1cae7fcf5421bd609d16b3ea5bb892acdf7569f11f312661734a4cbd0d35451e1eb656dd4dd02a5885f62361b6803120a0d690a42627ce09"

RPROVIDES:${PN} += "config-gamemoded \
gamemoded \
group-gamemode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libinih.so.0 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
