SUMMARY = "Runtime library of libguestfs"
DESCRIPTION = "Shared object library for libguestfs tools which are used to access \
and modify virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs0-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "fc3f7b58a59a687401af3114367b79309b9f0efe30e3356a1e1554b07994fc64ae4d632c09111186ddac102a844031a2ac3deeb13fcbb1376ebc2cbe0cad5481"

RPROVIDES:${PN} += "libguestfs.so.0 \
libguestfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/qemu-system-aarch64 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libjson-c.so.5 \
libpcre2-8.so.0 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
