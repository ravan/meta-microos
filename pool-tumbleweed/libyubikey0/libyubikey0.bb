SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey0-1.13-3.34.aarch64.rpm"
RPM_HASH = "0636b22f3196b5d4379c603680645194b260991d75b30654465a539dc8cc578600a032f997341e0aca695be2a7b50fdc5b71ae71271eb60e16b503ba85e16bbf"

RPROVIDES:${PN} += "libyubikey.so.0 \
libyubikey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
