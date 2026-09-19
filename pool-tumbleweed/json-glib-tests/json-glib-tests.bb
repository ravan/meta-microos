SUMMARY = "Installed tests for json-glib"
DESCRIPTION = "Installed tests for json-glib, compatible with gnome-desktop-testing-runner. \
Tests cover JSON parsing, serialization, and object mapping. \
Run with: gnome-desktop-testing-runner json-glib-1.0"
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.8"

RPM_NAME = "json-glib-tests-1.10.8-2.1.aarch64.rpm"
RPM_HASH = "b30a144c8d514039443bdefae6b32124e02f66e92fde1d5c5f80f9d8032dc085e271b62d17cda2f3715a52c07fde038492839dd0ff6f6477b69890e916282963"

RPROVIDES:${PN} += "json-glib-tests"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1-0-0 \
libjson-glib-1.0.so.0"

inherit rpm
