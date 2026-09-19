SUMMARY = "Motif User Interface Language library"
DESCRIPTION = "The Motif user interface language (UIL) is a specification language \
for describing the initial state of a Motif application's user \
interface."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libUil4-2.3.8-4.7.aarch64.rpm"
RPM_HASH = "05c1c200def355592b5337e70ee58a55960353c6c1dd10eac41e97b8857ab9244484cb69c0bf37e68925940ec428bf45f9689ddd70a1408b42a9385140d7d6dc"

RPROVIDES:${PN} += "libUil.so.4 \
libUil4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMrm.so.4 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
