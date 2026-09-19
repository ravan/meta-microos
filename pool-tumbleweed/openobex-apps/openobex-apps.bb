SUMMARY = "Open Source Implementation of the Object Exchange (OBEX) Protocol"
DESCRIPTION = "Various applications and ools using the Object Exchange (OBEX) Protocol libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "openobex-apps-1.7.2-3.14.aarch64.rpm"
RPM_HASH = "9bdb401dc86e9257f13601773d4cd16121a8a2b6e59142b06cebf902354fa1a38aa1ce6942b51a7c255448f205392331e34ceeeb510b3c95a382b4cca5d74fc1"

RPROVIDES:${PN} += "openobex-apps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenobex.so.2"

inherit rpm
