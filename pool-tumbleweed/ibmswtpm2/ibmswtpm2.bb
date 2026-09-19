SUMMARY = "IBM's Software TPM 2.0"
DESCRIPTION = "An implementation of the TCG TPM 2.0 specification. It is based on \
the TPM specification Parts 3 and 4 source code donated by Microsoft, \
with additional files to complete the implementation. \
 \
This TPM emulator listens on TCP ports (default 2321 and 2322) and \
saves state to the file 'NVChip' in the current directory. \
 \
It is probably not of much use other than testing the IBM TSS \
implementation because of this specific interface."
LICENSE = "BSD-3-Clause"

PV = "183+2024+03+27"

RPM_NAME = "ibmswtpm2-183+2024+03+27-6.5.aarch64.rpm"
RPM_HASH = "bb2453cf1ccd6c6c435def617c791907392bb355c47f118d21ad61091a70f313363e9ecdd5996f32c9e84205bffc31b0a7571979cbe8ab585d0c96b76349c635"

RPROVIDES:${PN} += "ibmswtpm2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
