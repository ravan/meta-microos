SUMMARY = "Create TOTP tokens using a TPM2"
DESCRIPTION = "This is a reimplementation of Matthew Garrett's tpmtotp software for TPM 2.0 using the tpm2-tss software stack. \
Its purpose is to attest the trustworthiness of a device against a human using time-based one-time passwords (TOTP), \
facilitating the Trusted Platform Module (TPM) to bind the TOTP secret to the known trustworthy system state. \
In addition to the original tpmtotp, given the new capabilities of in-TPM HMAC calculation, \
the tpm2-totp's secret HMAC keys do not have to be exported from the TPM to the CPU's RAM on boot anymore. \
Another addition is the ability to rebind an old secret to the current PCRs in case a software component was changed on purpose, \
using a user-defined password."
LICENSE = "BSD-3-Clause"

PV = "20240326.33e1986"

RPM_NAME = "tpm2-totp-20240326.33e1986-2.5.aarch64.rpm"
RPM_HASH = "2889839fc438ae9d09d8d0c6b5d1922f4afc5e5e0c0cc914e22322658b1ec62c95563606e6eb77f2982f88e33a4ec7755d74b1180ceac063d04959718ebf85f3"

RPROVIDES:${PN} += "tpm2-totp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqrencode.so.4 \
libtpm2-totp.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0"

inherit rpm
