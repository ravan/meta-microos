SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "6.30.0"

RPM_NAME = "kf6-syntax-highlighting-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c62f06d04c2cece3a641cda988515a57ae8fe625248419f23e0535d017edd72e18ec4cab030e2f5839096919bb9d7d4cc7b97091ae17e826f882972a58a4c71d"

RPROVIDES:${PN} += "kf6-syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6SyntaxHighlighting.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
