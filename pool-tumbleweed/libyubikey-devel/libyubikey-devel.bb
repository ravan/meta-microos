SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-devel-1.13-3.34.aarch64.rpm"
RPM_HASH = "c0d51b47e18324e33b0816347d14ac732097995e9c744be73b03b5e9b8bf2b45c597a421adb0c43ab8d032ed4d131e8f502d0184e3a747a390aa75f06c52c6ec"

RPROVIDES:${PN} += "libyubikey-devel"

RDEPENDS:${PN} += "glibc-devel \
libyubikey0"

inherit rpm
