SUMMARY = "A RADIUS client library"
DESCRIPTION = "The radcli library is a library for writing RADIUS Clients. The library's \
approach is to allow writing RADIUS-aware application in less than 50 lines \
of C code. It was based originally on freeradius-client and is source compatible \
with it."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.3"

RPM_NAME = "libradcli10-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "42c73b1404aefae0ec896cb82a51e31002f736b075564be5e466d6c3eeafdcb7ae5238877e5f05401b13a265aef240501a77a44339e92f5a1ff102f1733ea9f5"

RPROVIDES:${PN} += "libradcli.so.10 \
libradcli10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libnettle.so.8"

inherit rpm
