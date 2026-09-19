SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "python313-libvslvm-20260901-1.1.aarch64.rpm"
RPM_HASH = "9f58f01a4e5ba20b3a6d03c7e328fa9349783099ee26b46513dc45e4f593c355c752f9c3ddb7991e890e5a1a273223e4a2a0fb719a7ff545a340f3b998e330b3"

RPROVIDES:${PN} += "python3-libvslvm \
python313-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
