SUMMARY = "DEC-VT terminal emulator state machine"
DESCRIPTION = "TSM is a state machine for DEC VT100-VT520 compatible terminal \
emulators. It can be used to implement terminal emulators, or other \
applications that need to interpret terminal escape sequences. The \
library does no rendering or window management of its own, and does \
not depend on a graphics stack, unlike the similar GNOME libvte."
LICENSE = "LGPL-2.1-or-later"

PV = "4.7.1"

RPM_NAME = "libtsm4-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "3d771fda5530dd81eb6c704df3f0ff5a4003731450a27128098749495a3f8c55efc676d7c4131d5a4fa6472bd848e7817c5d7cab768f0838e32e2e0fd618e1a3"

RPROVIDES:${PN} += "libtsm.so.4 \
libtsm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
