SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-tpm_cert_store-7.14.3-1.1.noarch.rpm"
RPM_HASH = "58373b52ca731e41f99e9195388696ab7488906d274b35f4e1d2a04f6f6387d1320eef23d21986cc30e69ba9f06c8f0a225669d32ad1fde5902868f3b8722db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tss \
python3-keylime \
sysuser-shadow"

inherit rpm
