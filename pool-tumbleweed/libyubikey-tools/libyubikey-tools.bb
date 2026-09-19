SUMMARY = "Tools to support Yubico's USB key low-level C library"
DESCRIPTION = "Binary tools to support Yubico's Low-level library for decrypting and \
parsing Yubikey One-Time Passwords (OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-tools-1.13-3.34.aarch64.rpm"
RPM_HASH = "ea127aed7cf0ca2f0e980e0a7142a5cf1870bcc2a8931454d82674c7338832271a13a0ba20f010a800fa8ba1f49024ac1dc529ac54b2f62da642f96097a57902"

RPROVIDES:${PN} += "libyubikey-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyubikey.so.0"

inherit rpm
