SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types. You \
create a gensio object (or a gensio), and you can use that gensio \
without having to know too much about what is going on underneath. \
You can stack gensio on top of another one to add protocol \
funcionality. For instance, you can create a TCP gensio, stack SSL \
on top of that, and stack Telnet on top of that. It supports a \
number of network I/O and serial ports. gensios that stack on \
other gensios are called filters."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "gensio-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "6be8091f88167b7d68b45ef24ed1e541adfffc3e6fb8a41c3d19e82d2926bdf775ad630816b637faf13768eb0966a7b6ed2b4064c9cf0c4c1dfdc1415bb9d37c"

RPROVIDES:${PN} += "gensio"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgensio.so.14 \
libgensiomdns.so.14 \
libgensioosh.so.14"

inherit rpm
