SUMMARY = "IDE for The Coq Proof Assistant"
DESCRIPTION = "The Coq Integrated Development Interface is a graphical interface for the Coq proof assistant."
LICENSE = "LGPL-2.1-only"

PV = "9.2.0"

RPM_NAME = "rocq-ide-9.2.0-2.1.aarch64.rpm"
RPM_HASH = "d9e287c823ccf2eeb58e47a2ef296d54bde44ecf7d1529ede383b6d8d392ef7271f77c05a209d407710dcc7c0368f736a1f917ba61d83118c249587fb099ddfa"

RPROVIDES:${PN} += "coq-ide \
rocq-ide"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
rocq"

inherit rpm
