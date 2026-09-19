SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.116.0"

RPM_NAME = "syntax-highlighting-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "d9a89812fc07a126b49bf72481403d875dc4a2fef89a96cd189473db84a431c5bbc75be22c15ac2a4797e51bf13815bb1b0633000c24513434697b9fa9ac93db"

RPROVIDES:${PN} += "syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
