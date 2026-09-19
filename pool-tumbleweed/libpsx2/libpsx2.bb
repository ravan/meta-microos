SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.78"

RPM_NAME = "libpsx2-2.78-1.4.aarch64.rpm"
RPM_HASH = "f5076c214aec40e9cca8ecb3cd432f215dce4bffe221b89fb36fe7d86473517f89da630a20319280ed881b1d84755c2df0afa1cec19b3eba38a1c29a2693875f"

RPROVIDES:${PN} += "libpsx.so.2 \
libpsx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
