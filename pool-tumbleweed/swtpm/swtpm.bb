SUMMARY = "Software TPM emulator"
DESCRIPTION = "The SWTPM package provides TPM emulators with different front-end interfaces \
to libtpms. TPM emulators provide socket interfaces (TCP/IP) and the Linux \
CUSE interface for the creation of multiple native /dev/vtpm* devices. \
Those can be the targets of multiple QEMU cuse-tpm instances."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "swtpm-0.10.2-1.1.aarch64.rpm"
RPM_HASH = "d957f0f41cc4357a40caec981f0303aa6f9d144afe39af847ac31da9ad0fbdd9696f4f42618d933e1fa34f02c26fe5c89f669bcb9550869539c1c9a1ed7e6d8a"

RPROVIDES:${PN} += "config-swtpm \
libswtpm-libtpms.so.0 \
swtpm"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/env \
gnutls \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libseccomp.so.2 \
libtasn1.so.6 \
libtpms.so.0 \
user-tss"

inherit rpm
