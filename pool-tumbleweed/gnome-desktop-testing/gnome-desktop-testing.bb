SUMMARY = "Runner for GNOME installed tests"
DESCRIPTION = "This package provides the gnome-desktop-testing-runner binary (also \
symlinked as ginsttest-runner), the standard runner for the GNOME \
installed-tests infrastructure. It discovers and executes test programs \
installed under the system libexec installed-tests directory, using \
the .test metadata files in the system data installed-tests directory."
LICENSE = "LGPL-2.0-or-later"

PV = "2021.1"

RPM_NAME = "gnome-desktop-testing-2021.1-2.1.aarch64.rpm"
RPM_HASH = "6b7ba914ac55f6a8650851565aa0de83f7ce29a5018938591273034df859a05903fe3e48436bab030b18f8db61091260d1d74d5db58497108e2ab1766d8f31e5"

RPROVIDES:${PN} += "gnome-desktop-testing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
