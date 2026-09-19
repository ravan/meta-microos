SUMMARY = "Libraries and programs for CW development"
DESCRIPTION = "Unixcw is a project providing libcw library and a set of programs using the \
library: cw, cwgen, cwcp and xcwcp. The programs are intended for people who \
want to learn receiving and sending Morse code. unixcw is developed and tested \
on GNU/Linux system. \
 \
This package contains the file needed for building with unixcw."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.1"

RPM_NAME = "unixcw-devel-3.6.1-1.7.aarch64.rpm"
RPM_HASH = "e44f86449965ed1163c13cc1036c1c0734f112e69420be30de999c7d098385a04290825a748d6b9a058838224eaff5f3a3bb5e4fae94e8d04fc6e4e8cbd6cebf"

RPROVIDES:${PN} += "pkgconfig-libcw \
unixcw-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcw8"

inherit rpm
