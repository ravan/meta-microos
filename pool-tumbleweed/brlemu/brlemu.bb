SUMMARY = "Emulates a braille display"
DESCRIPTION = "Brlemu emulates a braille display. It is intended for testing braille \
support without needing to acquire expensive hardware devices."
LICENSE = "GPL-2.0-only"

PV = "0.1"

RPM_NAME = "brlemu-0.1-63.9.aarch64.rpm"
RPM_HASH = "ec43c176b60ed7b5a490dd3499f363dfa1a4bbd5eabf8e73d0b6b32fd41a1c597c9793742b0a2bf72c29aae04fcad0c151e82318bd558fa33b489af373f04752"

RPROVIDES:${PN} += "brlemu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
