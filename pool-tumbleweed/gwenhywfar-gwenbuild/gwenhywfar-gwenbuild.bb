SUMMARY = "Specific build system for the aqbanking universe"
DESCRIPTION = "Gwenbuild is a lightweight and fast build system tailored for the \
aqbanking universe."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-gwenbuild-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "9756c2fa8803927a044409185fca7c9b85ea73904957e0d3af5d7485e82a8d7b1fcefa4a90c13f2359a3f3fb900f3ebcebb4306642599b5fb6088dfebcdd5fb9"

RPROVIDES:${PN} += "gwenhywfar-gwenbuild"

RDEPENDS:${PN} += "gwenhywfar-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
