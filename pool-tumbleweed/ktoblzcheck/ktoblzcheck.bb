SUMMARY = "A library to check account numbers and bank codes of German banks"
DESCRIPTION = "KtoBLZCheck is a library to check account numbers and bank codes \
of German banks. Both a library for other programs as well as a \
short command-line tool is available. It is possible to check \
pairs of account numbers and bank codes (BLZ) of German banks, \
and to map bank codes (BLZ) to the clear-text name and location \
of the bank."
LICENSE = "LGPL-2.1-only"

PV = "1.59"

RPM_NAME = "ktoblzcheck-1.59-1.5.aarch64.rpm"
RPM_HASH = "d77e06427ae4401fd0511c8657f17f0902f3160a415e183b40c20b6a0c106879f01f288e57488cff6935f99df685e7a21194fe12ae93f1eb5bab24328ead90a3"

RPROVIDES:${PN} += "ktoblzcheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libktoblzcheck.so.1 \
libstdc++.so.6"

inherit rpm
