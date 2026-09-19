SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ivshmem-tools-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "8451997ddad0833ac0368dfbdd762c9ca06288fa7a739005979e598570dbb3eb88bb5f30bb6981ac73771a1e15088093c14972ad41ee2076de5588f79844dd7e"

RPROVIDES:${PN} += "qemu-ivshmem-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1"

inherit rpm
