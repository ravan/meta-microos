SUMMARY = "Module for Simple Terminal Control"
DESCRIPTION = "This module, ReadKey, provides ioctl control for terminals and Win32 consoles \
so the input modes can be changed (thus allowing reads of a single character at \
a time), and also provides non-blocking reads of stdin, as well as several \
other terminal related features, including retrieval/modification of the screen \
size, and retrieval/modification of the control characters."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "2.38"

RPM_NAME = "perl-Term-ReadKey-2.38-1.39.aarch64.rpm"
RPM_HASH = "44b3e66e1963bc9cf62d9fe408efad33f4644fec01e2a5e45c1398526141e3561e978a6f0c027fa3d1ad3a6a9967cd0c56bbf2ed24d931853a30504cc9268f4b"

RPROVIDES:${PN} += "perl-Term--ReadKey \
perl-Term-ReadKey \
perl-TermReadKey"

RDEPENDS:${PN} += "/usr/bin/stty \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
