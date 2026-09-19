SUMMARY = "DTS Coherent Acoustics decoder library"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains the library for decoding DTS Coherent \
Acoustics streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "libdca0-0.0.7+2-1.13.aarch64.rpm"
RPM_HASH = "ae2c1a01e5715d5a11176791ca602f605d0eaf82818f5fe3217726b3ba054b7f245903977908780d2610c3db7fc75cf798a8710ed578b8a755cd4113893c96d4"

RPROVIDES:${PN} += "libdca.so.0 \
libdca0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
