SUMMARY = "A configuration file parser library"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4"

RPM_NAME = "libconfuse2-3.4-1.1.aarch64.rpm"
RPM_HASH = "11d3379386a41c30c43a401aadb23762d91af73b7dd375c052d4261fa6bcf8be78c4eb026bf6aa2521e689b4a687d78a04ff151a48e6819e2272074653ef21ee"

RPROVIDES:${PN} += "libconfuse.so.2 \
libconfuse2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
