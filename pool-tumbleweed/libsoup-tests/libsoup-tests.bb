SUMMARY = "Installed tests for libsoup"
DESCRIPTION = "Installed tests for libsoup (libsoup3), compatible with gnome-desktop-testing-runner. \
Tests cover HTTP client/server, authentication, cookies, and TLS. \
Run with: gnome-desktop-testing-runner libsoup-3.0"
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.6"

RPM_NAME = "libsoup-tests-3.6.6-8.1.aarch64.rpm"
RPM_HASH = "a0f6a92f89763f1fc97422c6a5a46e86ba37df2058c905084c1d70ed3695d444e1acce351cb1af32d1878c62010c5c583621336ddfdbce0951ab3313ab0cfccc"

RPROVIDES:${PN} += "libsoup-tests \
libtest-utils.so"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libnghttp2.so.14 \
libpsl.so.5 \
libsoup-3-0-0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libz.so.1"

inherit rpm
