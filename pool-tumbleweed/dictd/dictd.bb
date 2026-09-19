SUMMARY = "DICT protocol (RFC 2229) server and command-line client"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details."
LICENSE = "BSD-3-Clause & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.13.3+git.1731775346.2b21553"

RPM_NAME = "dictd-1.13.3+git.1731775346.2b21553-2.6.aarch64.rpm"
RPM_HASH = "f3443efcd75fb60817db8b37a45cedb91507c36ac2a2e483f0c7498fd18b2d5584569382e66b92cd6d66a482dcb96045574c654bbc19766079424ce807985dd1"

RPROVIDES:${PN} += "config-dictd \
dictd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libmaa.so.4 \
libz.so.1"

inherit rpm
