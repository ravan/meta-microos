SUMMARY = "Predict TPM PCR values"
DESCRIPTION = "This utility tries to predict the values of the TPM's Platform \
Configuration Registers following an update of system components \
like shim, grub, etc."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "pcr-oracle-0.6.5-1.1.aarch64.rpm"
RPM_HASH = "7395511d4e75b274f454d6a4212855fc0634cbc48cc3c89c88178ba36a901d965bd2725a58eec23b992fe83999027e60d41db6eaa98997bd8a1eb522399536be"

RPROVIDES:${PN} += "pcr-oracle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libelf.so.1 \
libfdisk.so.1 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tcti-device0 \
libtss2-tctildr.so.0"

inherit rpm
