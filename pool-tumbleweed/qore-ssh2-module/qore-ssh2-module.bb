SUMMARY = "SSH2 module for Qore"
DESCRIPTION = "This module provides access to ssh2 sessions and the sftp protocol \
via libssh2 in the Qore programming language."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.4.2"

RPM_NAME = "qore-ssh2-module-1.4.2-4.5.aarch64.rpm"
RPM_HASH = "65816c99892468311ddc557bd17dc3b27ad68fdd462921a1ad8dcc5e187b62a730b003679c219ca6e7561e7242f927ad547d6b948e91923ec44f68dc60cc4558"

RPROVIDES:${PN} += "qore-ssh2-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libssh2.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
