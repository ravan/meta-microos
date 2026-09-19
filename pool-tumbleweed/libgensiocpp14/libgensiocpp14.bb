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

RPM_NAME = "libgensiocpp14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "cadf06569a2b58b83c16c3b75dd6c6162c6473f48dadbc956ab964736e25f29b7b970fff2c131d22688aa6792c15dea73587c9a2f214fa3680d4f1b26374a4a0"

RPROVIDES:${PN} += "libgensiocpp.so.14 \
libgensiocpp14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio.so.14 \
libgensioosh.so.14 \
libgensiooshcpp.so.14 \
libstdc++.so.6"

inherit rpm
