SUMMARY = "Bootstrap-daemon for toxcore"
DESCRIPTION = "Bootstrap-daemon to dispose hashtable for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.23"

RPM_NAME = "c-toxcore-daemon-0.2.23-1.3.aarch64.rpm"
RPM_HASH = "be3b1645ba2dafaf51160b29bb076ded70e80cc0cc9446f0d83f5d7bd5d05524938dc1ba2ae36c7e99409d534b60dd8b88b903ded26fced3246195c270101b55"

RPROVIDES:${PN} += "c-toxcore-daemon \
config-c-toxcore-daemon \
group-tox \
group-toxcmd \
user-tox"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
libtoxcore.so.2"

inherit rpm
