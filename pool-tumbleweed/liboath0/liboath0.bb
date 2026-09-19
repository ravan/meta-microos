SUMMARY = "Library for Open AuTHentication (OATH) HOTP support"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "liboath0-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "1143999ec9069b6a0f2997c01d6d4ae7f740613513b083f32bf190345776f45422aa94cab9a8c7c955fd1414830b778f19e8d5e47ad1520a73926487d35a7117"

RPROVIDES:${PN} += "liboath.so.0 \
liboath0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
oath-toolkit-xml"

inherit rpm
