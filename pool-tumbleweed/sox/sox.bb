SUMMARY = "Sound Conversion Tools"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "14.4.2"

RPM_NAME = "sox-14.4.2-9.11.aarch64.rpm"
RPM_HASH = "9b2b6e1135671a879973a4a186b80f29e9520ca55349a688efded73e12bfe76cb53b79475e971d96a1e6559ad6643b55359783bcc8c7477988c1d62fd990cbe5"

RPROVIDES:${PN} += "sox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsox.so.3"

inherit rpm
