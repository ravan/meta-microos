SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libelf1-0.194-1.4.aarch64.rpm"
RPM_HASH = "a08eaae3548507ee3e47adbd12d203e3faa8b192dc46bfe4d8b8b947e84c6a89caeaf012ba8d32272f64ddfe4d1c2a369928c89f3bafbf13d223b6237256e72d"

RPROVIDES:${PN} += "libelf.so.1 \
libelf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
