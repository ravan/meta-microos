SUMMARY = "LADI Session Handler"
DESCRIPTION = "LADI Session Handler or simply ladish is a session management system for JACK applications on GNU/Linux."
LICENSE = "AFL-2.1 & GPL-2.0-or-later"

PV = "1+git.20210227"

RPM_NAME = "ladish-1+git.20210227-1.4.aarch64.rpm"
RPM_HASH = "66c5218a407ae37e43007f66c33c179b13252e84c14cc027b779dc5139a2ebaec0a02febdecf600bfcfbfe01e5457dca31e9b58fcfebebdf4b538f6e2613d1a5"

RPROVIDES:${PN} += "ladish \
libalsapid.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
a2jmidid \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libjack.so.0 \
libuuid.so.1"

inherit rpm
