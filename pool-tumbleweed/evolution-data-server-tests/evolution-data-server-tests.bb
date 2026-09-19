SUMMARY = "Tests for evolution-data-server"
DESCRIPTION = "The evolution-data-server-tests package contains tests that can be used to verify \
the functionality of the installed evolution-data-server package. \
Tests use the GNOME installed-tests framework and can be run with \
gnome-desktop-testing-runner."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "evolution-data-server-tests-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "b2ca70b295ad9e4d9cbfeaff341e96b47cd4295ec90d86c8085fac9305f9dae63f4a9208157cbfafcff7f3ce5a05b739480381e24460fe3467240ab2b054713c"

RPROVIDES:${PN} += "evolution-data-server-tests \
libetestserverutils.so.0"

RDEPENDS:${PN} += "evolution-data-server \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebackend-1.2.so.11 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libecal-2.0.so.3 \
libedata-book-1.2.so.27 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3 \
libsqlite3.so.0"

inherit rpm
