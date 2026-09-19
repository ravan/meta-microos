SUMMARY = "Graphical interface program for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains the graphical interface program for stoken."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "0.93"

RPM_NAME = "stoken-gui-0.93-1.12.aarch64.rpm"
RPM_HASH = "ca79938759411ff3d7eec7240334ccc0309939027f555f4177d6acf2862e45caa46afbf44938a687f1662887f8df4271e30d85b300caede6f51fbfdf163ec01d"

RPROVIDES:${PN} += "stoken-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstoken.so.1 \
libstoken1"

inherit rpm
