SUMMARY = "A System Information and Benchmark for Linux"
DESCRIPTION = "Hardinfo2 is based on hardinfo. \
 \
Hardinfo2 offers System Information and Benchmark for Linux Systems. It is able \
to obtain information from both hardware and basic software. It can benchmark \
your system and compare to other machines online. \
 \
Features include: \
 - Report generation (in either HTML or plain text) \
 - Online Benchmarking - compare your machine against other machines"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "hardinfo2-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "2c887bdce1d2a90c6dd750fb799a448eff0d2d64201a9988f0410118b202c27ed272510795437cef988648fd5f55188da30aca9ec02a6b62b1acd44c30fc3c09"

RPROVIDES:${PN} += "hardinfo2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libdecor-0.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb.so.1"

inherit rpm
