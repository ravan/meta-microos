SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "python314-libvmdk-20260714-1.2.aarch64.rpm"
RPM_HASH = "8844cb2bc52c176583dad20443bfc4c0a0caa715078a6efb8b4eb7967ea4fbb84a14d2d74e2ea5248691b684c11cf9c2eff4274e81014ec0170370ce18a7e1f7"

RPROVIDES:${PN} += "python314-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
