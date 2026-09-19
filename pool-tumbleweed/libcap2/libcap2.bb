SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.78"

RPM_NAME = "libcap2-2.78-1.4.aarch64.rpm"
RPM_HASH = "d581b5c8af95a6bc3a4eddb152aa30600d0d503c82803300ba2f5949df9e11c27cf0476e80abe2daeab1f3decba8f2e910e7b0c406fc7b9232a9d6733b415de9"

RPROVIDES:${PN} += "libcap.so.2 \
libcap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
