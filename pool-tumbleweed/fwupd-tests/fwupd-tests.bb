SUMMARY = "Installed tests for fwupd"
DESCRIPTION = "Data files for installed tests. Tests use the GNOME installed-tests \
framework and can be run with gnome-desktop-testing-runner. \
Device emulation data is included so tests run without real hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-tests-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "1e486f314701f57491426963794961ac9ad417e01a3cb5532ca0b52775e07c638548b6aecc8ab606b0da37f577edf0873c2426930c4af7852a7dff53cef4ff57"

RPROVIDES:${PN} += "fwupd-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
fwupd \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfwupd.so.3 \
libfwupdplugin.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libmnl.so.0 \
libsystemd.so.0 \
libxmlb.so.2"

inherit rpm
