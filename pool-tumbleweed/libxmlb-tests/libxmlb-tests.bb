SUMMARY = "Installed tests for libxmlb"
DESCRIPTION = "This package provides installed tests for libxmlb, \
compatible with gnome-desktop-testing-runner."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.29"

RPM_NAME = "libxmlb-tests-0.3.29-2.1.aarch64.rpm"
RPM_HASH = "2837d33d96b770edabf2c726bb7dfa756d6addf1d51597be1a064b8b4aee00a97a12e249e8506988f8133a7f2d4bef2e93ecb1c3d5de11deca12592eb0e317d7"

RPROVIDES:${PN} += "libxmlb-tests"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libstemmer.so.0d \
libxmlb.so.2 \
libxmlb2 \
libzstd.so.1"

inherit rpm
