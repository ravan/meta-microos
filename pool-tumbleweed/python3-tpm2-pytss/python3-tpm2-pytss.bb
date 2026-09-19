SUMMARY = "Python bindings for TSS"
DESCRIPTION = "TPM2 TSS Python bindings for Enhanced System API (ESYS), Feature API \
(FAPI), Marshaling (MU), TCTI Loader (TCTILdr) and RC Decoding \
(rcdecode) libraries. It also contains utility methods for wrapping \
keys to TPM 2.0 data structures for importation into the TPM, \
unwrapping keys and exporting them from the TPM, TPM-less \
makecredential command and name calculations, TSS2 PEM Key format \
support, importing Keys from PEM, DER and SSH formats, conversion from \
tpm2-tools based command line strings and loading tpm2-tools context \
files."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python3-tpm2-pytss-2.3.0-2.6.aarch64.rpm"
RPM_HASH = "9f9e83643c0c2f817fba76e1c093b9369162732e995cada826c232cc59771c1aa2d6c072bf14c8de689b1d683c0bcce5aca93b59172690f39aa31ae5194235c7"

RPROVIDES:${PN} += "python3-tpm2-pytss \
python3.13dist-tpm2-pytss \
python3dist-tpm2-pytss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-esys.so.0 \
libtss2-fapi.so.1 \
libtss2-mu.so.0 \
libtss2-policy.so.0 \
libtss2-rc.so.0 \
libtss2-tcti-spi-helper.so.0 \
libtss2-tctildr.so.0 \
pkgconfig-tss2-esys \
pkgconfig-tss2-fapi \
python-abi \
python3-PyYAML \
python3-asn1crypto \
python3-cffi \
python3-cryptography \
python3-packaging"

inherit rpm
