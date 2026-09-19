SUMMARY = "Password-based encryption utility using the scrypt key derivation function"
DESCRIPTION = "The scrypt key derivation function was originally developed for use in the \
Tarsnap online backup system and is designed to be far more secure against \
hardware brute-force attacks than alternative functions such as PBKDF2 or \
bcrypt."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "scrypt-1.3.3-1.5.aarch64.rpm"
RPM_HASH = "900ce72798cd6c214740007db420c9c0fd7007a4c7f36e9464691da3ac5b3890dc9b1f33b1ee00d49166d2b9a1c7ea2cc34db001f58bdc570f8716f31a8a1193"

RPROVIDES:${PN} += "scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
