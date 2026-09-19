SUMMARY = "TSS (TCG Software Stack) access daemon for a TPM chip"
DESCRIPTION = "The trousers package provides a TSS implementation through the help of \
a user-space daemon, the tcsd, and a library  Trousers aims to be \
compliant to the 1.1b and 1.2 TSS specifications as available from the \
Trusted Computing website https://www.trustedcomputinggroup.org/. \
 \
The package needs the /dev/tpm device file to be present on your \
system. It is a character device file major 10 minor 224, 0600 tss:tss."
LICENSE = "BSD-3-Clause"

PV = "0.3.15"

RPM_NAME = "trousers-0.3.15-9.4.aarch64.rpm"
RPM_HASH = "7f5ecbe3edb44fd7102b6d30ef02838ebe5e3638de3506ecbf54b122c35c1f52b63bfa773a2401deb6ae0c810374145fe75f0eebf80cfc5bcb4a3ac4b8d9cbde"

RPROVIDES:${PN} += "config-trousers \
trousers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
group-tss \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
udev \
user-tss"

inherit rpm
