SUMMARY = "Machine emulator and virtualizer for ARM architectures"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package provides arm emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-arm-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "808ddb6a7fb907d45924de380d34c256c88c431b4802a9f1eac74aeb50e90fed6770ae1ae2ec344fb64407f5e83ebf40c1d87504a80e06bf4a4ed0b26891a08e"

RPROVIDES:${PN} += "qemu-arm"

RDEPENDS:${PN} += "ipxe-qemu \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libbpf.so.1 \
libc.so.6 \
libcapstone.so.5 \
libfdt.so.1 \
libfuse3.so.4 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libibverbs.so.1 \
libjpeg.so.8 \
libkeyutils.so.1 \
liblzo2.so.2 \
libm.so.6 \
libnuma.so.1 \
libpam.so.0 \
libpixman-1.so.0 \
libpng16.so.16 \
librdmacm.so.1 \
libsasl2.so.3 \
libseccomp.so.2 \
libslirp.so.0 \
libsnappy.so.1 \
libudev.so.1 \
liburing.so.2 \
libvdeplug.so.3 \
libxdp.so.1 \
libz.so.1 \
libzstd.so.1 \
qemu"

inherit rpm
