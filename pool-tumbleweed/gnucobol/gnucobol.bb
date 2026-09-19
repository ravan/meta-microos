SUMMARY = "A COBOL compiler"
DESCRIPTION = "GnuCOBOL is a COBOL compiler which implements a substantial part of \
the COBOL 85, COBOL 2002 and COBOL 2014 standards, as well as many \
extensions included in other COBOL compilers. \
 \
GnuCOBOL translates COBOL into C and compiles the translated code \
using a native C compiler. cobc translates COBOL to executable using \
intermediate C sources, providing full access to nearly all C \
libraries."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gnucobol-3.2-4.2.aarch64.rpm"
RPM_HASH = "eb5561920b75bd29febc24cfa9b5ff032b4284ba1ed76c65d6a951e8fd8ac808da11df202abe26cfc10186ff954300f0c884705dacb16b82c782f6730ec57e7d"

RPROVIDES:${PN} += "gnu-cobol \
gnucobol \
libcob-devel \
opencobol"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcob.so.4"

inherit rpm
