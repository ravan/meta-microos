SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "6.30.0"

RPM_NAME = "libKF6SyntaxHighlighting6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "fa5d54628047495e9d29505c8f53d011756195ea79ccec0e196466568cba5ac63b94fc94056bdd00eabadd8d8aba1e1044f0e01f384cac1ed696d2936d4ba684"

RPROVIDES:${PN} += "libKF6SyntaxHighlighting.so.6 \
libKF6SyntaxHighlighting6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
