SUMMARY = "Kana–Kanji conversion engine"
DESCRIPTION = "A Kana–Kanji conversion engine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "libanthy0-9100h-42.12.aarch64.rpm"
RPM_HASH = "35c05acbe3b3453ddc20aeefa5e0bb1e3b61423896779be87b9d38e8693e9eca7ff7423cd79469990a634faf0a3ef62897cbca667d00ee1e0db6380c1b6f80a2"

RPROVIDES:${PN} += "libanthy.so.0 \
libanthy0 \
libanthydic.so.0 \
libanthyinput.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
