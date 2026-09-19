SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "python314-libvslvm-20260901-1.1.aarch64.rpm"
RPM_HASH = "475d0ce56199bb50b6e5a9d9023bfc45cce48e7c464f89dd2b734dd82c6cb1aa27ad3adb64d0017f18cfc2a29c07d31a94d0f81f071b068271cd9802960c643d"

RPROVIDES:${PN} += "python314-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
