SUMMARY = "Library for CanoKey support in QEMU"
DESCRIPTION = "CanoKey is an open-source secure key with supports of U2F / FIDO2 with Ed25519 \
and HMAC-secret, OpenPGP Card V3.4 with RSA4096, Ed25519 and more 2, \
PIV (NIST SP 800-73-4), HOTP / TOTP, NDEF."
LICENSE = "Apache-2.0"

PV = "0.0+git20230606.151568c"

RPM_NAME = "canokey-qemu-0.0+git20230606.151568c-4.4.aarch64.rpm"
RPM_HASH = "9b48d1142314016e160b109b8c927c77e21fccf2470f7817fce62ca20571bc4ca5c8b8c6d6ef9d71e1666d5c4a42fed32d4581e7204dd3d51c312f3a1d1e5b3a"

RPROVIDES:${PN} += "canokey-qemu \
libcanokey-qemu.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
