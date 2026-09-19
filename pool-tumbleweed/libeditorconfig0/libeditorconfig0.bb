SUMMARY = "EditorConfig core library written in C"
DESCRIPTION = " \
EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains shared library."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.11"

RPM_NAME = "libeditorconfig0-0.12.11-1.3.aarch64.rpm"
RPM_HASH = "236d3de32bda07422d09b47c79db94f1779c0c5052eb2c4b2e29d3f08f30a2c50212409a2697fa7660fffb1ef335297810459687879013d450231c370434dc1c"

RPROVIDES:${PN} += "libeditorconfig.so.0 \
libeditorconfig0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
