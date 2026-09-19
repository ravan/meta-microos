SUMMARY = "Experimental XEP-0280: Message Carbons plugin for libpurple"
DESCRIPTION = "Experimental XEP-0280: Message Carbons plugin for libpurple \
(Pidgin, Finch, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.3"

RPM_NAME = "libpurple-plugin-carbons-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "a431c0bf387d33b4ac0cc0b317ff393004a913661ce5ebde551d96e51d4e5fc3014193e8036f1320f324fbae2ace06aab7839af70a2f949ff2ffe654d79fccc2"

RPROVIDES:${PN} += "libpurple-plugin-carbons"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libjabber.so.0"

inherit rpm
