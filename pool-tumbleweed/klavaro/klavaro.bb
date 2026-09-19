SUMMARY = "Typing tutor"
DESCRIPTION = "Klavaro  is a touch typing tutor that is very \
flexible and supports customizable keyboard \
layouts. Users can edit and save new or unknown \
keyboard layouts, as the basic course provided by \
the program was designed to not depend on specific \
layouts."
LICENSE = "GPL-3.0-or-later"

PV = "3.14"

RPM_NAME = "klavaro-3.14-1.14.aarch64.rpm"
RPM_HASH = "d97b54363a876d2ec053b3d79280d1452ea1b5d53d7e8187b9a6f47a3181bb5f7e095eadf0fa2a29145fcf00a118aaaf000ba86b3099537ca7f5967f78349ca0"

RPROVIDES:${PN} += "klavaro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkdatabox.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
