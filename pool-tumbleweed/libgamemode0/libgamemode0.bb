SUMMARY = "GameMode client library"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemode is the client library used by games or libgamemodeauto to \
talk to the GameMode daemon."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "libgamemode0-1.8.2-1.9.aarch64.rpm"
RPM_HASH = "a124f6d1d708f210e06ba3ffae2ea61ee150ee2239da729171a68113500416612b108a333ebe3f2618c010a9490783d41e670edfd06d397ca3e654f36c0ef874"

RPROVIDES:${PN} += "libgamemode.so.0 \
libgamemode0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gamemoded \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
systemd"

inherit rpm
