SUMMARY = "Crack legacy zip encryption with Biham and Kocher's known plaintext attack"
DESCRIPTION = "bkcrack is a command-line tool which implements a known plaintext attack \
against legacy encrypted ZIP archives. The vulnerability was shown by Eli Biham \
and Paul C. Kocher in the research paper 'A known plaintext attack on the PKZIP \
stream cipher.' The main features are: \
 \
* Recover internal state from ciphertext and plaintext. \
* Remove or change a ZIP archive's password using the internal state. \
* Recover the original password from the internal state."
LICENSE = "Zlib"

PV = "1.8.1"

RPM_NAME = "bkcrack-1.8.1-1.4.aarch64.rpm"
RPM_HASH = "39c16bce2e8dfd73c7fee22f625bf6f0fc3596ed9dc2371a6847f742a380259b5ed4ccc4c23792c92af71a30ac0660b655d2f1b3b392c48ce14f860fb8b4c36f"

RPROVIDES:${PN} += "bkcrack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
