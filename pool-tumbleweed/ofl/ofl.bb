SUMMARY = "Open File Lister from hxtools"
DESCRIPTION = "ofl lists processes (and can send signals to them) that have \
directories or files in specific locations in use. It differs from \
lsof/fuser in that it can scan recursively and won't bluntly look at \
an entire mount."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "ofl-20251011-1.6.aarch64.rpm"
RPM_HASH = "a002a8a41b10f831059ff55b08fc1d000da2966b96043517f584dd92fb26f041c012f11c9f563a1bb4b11bea3e0b9c7804b33ac1674890b19b234fd6e33e037a"

RPROVIDES:${PN} += "ofl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6"

inherit rpm
