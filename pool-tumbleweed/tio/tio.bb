SUMMARY = "Simple TTY terminal I/O application"
DESCRIPTION = "Tio is a simple TTY terminal application which features a straightforward \
commandline interface to easily connect to TTY devices for basic input/output."
LICENSE = "GPL-2.0-or-later"

PV = "3.9"

RPM_NAME = "tio-3.9-1.6.aarch64.rpm"
RPM_HASH = "d945646ddf4c4d499adab7540bfab412fa9e788a83225c1d26b734a1919245193b82efef75b36362320dccb48c010d308c05da7fc36048fc772dd1dfc402bcf5"

RPROVIDES:${PN} += "tio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblua5.3.so.5"

inherit rpm
