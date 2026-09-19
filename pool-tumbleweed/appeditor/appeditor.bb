SUMMARY = "Application Entry Editor"
DESCRIPTION = "A program to edit application entries shown in the application menu, \
and to edit their properties."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "appeditor-1.1.5-1.12.aarch64.rpm"
RPM_HASH = "6cdf16af1577649271fb020bd7a9a130c3ae6830ba21f5b17a2f72c230c5a466c5862253a94988a629eddd5c95a63b1207b449c0ebb6f7e1956a04f6cc63efd1"

RPROVIDES:${PN} += "appeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
