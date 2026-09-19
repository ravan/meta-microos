SUMMARY = "Development files for CanoKey support in QEMU"
DESCRIPTION = "Development files for CanoKey support in QEMU. \
 \
CanoKey is an open-source secure key with supports of U2F / FIDO2 with Ed25519 \
and HMAC-secret, OpenPGP Card V3.4 with RSA4096, Ed25519 and more 2, \
PIV (NIST SP 800-73-4), HOTP / TOTP, NDEF."
LICENSE = "Apache-2.0"

PV = "0.0+git20230606.151568c"

RPM_NAME = "canokey-qemu-devel-0.0+git20230606.151568c-4.4.aarch64.rpm"
RPM_HASH = "f8237f6e53525dfdbc26a3617c508fb909619874954376f047daeeb0749f3151d1ab4577b70413dc89130751a4c6300500b710945e71f7634d933fc47f9be6c9"

RPROVIDES:${PN} += "canokey-qemu-devel \
pkgconfig-canokey-qemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
canokey-qemu"

inherit rpm
