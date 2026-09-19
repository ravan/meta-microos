SUMMARY = "INI file parser library"
DESCRIPTION = "libconfini is a INI file parser library written in C."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini0-1.16.4-1.15.aarch64.rpm"
RPM_HASH = "b1c375cd9b945ee3f9fd502e3d1e8d8cd6d0e3ac9b2674575e2bf0ddb53271befdd5e9e08bd397e33631384ba1a06aa67886dd0ab8ba5b7dc961b1bede093804"

RPROVIDES:${PN} += "libconfini.so.0 \
libconfini0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
