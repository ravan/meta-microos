SUMMARY = "Library for interfacing the Music Player Daemon"
DESCRIPTION = "A stable, documented, asynchronous API library for interfacing MPD (Music Player Daemon)."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.27"

RPM_NAME = "libmpdclient2-2.27-1.1.aarch64.rpm"
RPM_HASH = "5efc5ba13bd5f8d500db0d89a24ed7cc6a15b0ab6ec65b63780691b6ecd6ac7c778b0e54ae7f424e3ce6e47c275f55487842bb0beeba0542637bf227e0adcb43"

RPROVIDES:${PN} += "libmpdclient.so.2 \
libmpdclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
