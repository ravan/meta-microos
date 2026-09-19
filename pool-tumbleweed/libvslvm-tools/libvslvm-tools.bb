SUMMARY = "Several tools for reading Linux Logical Volume Manager (LVM) systems"
DESCRIPTION = "Several tools for reading Linux Logical Volume Manager (LVM) volume \
systems. \
 \
See libvslvm for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvslvm-tools-20260901-1.1.aarch64.rpm"
RPM_HASH = "8994ab011329cd2a85f48c3193c9090328162756b91d01b70acdd0a51acb5cf43bb9d155d269cf8b6a8e51a0aa231190265074f819d1de7c1ff208506836a1aa"

RPROVIDES:${PN} += "libvslvm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse3.so.4 \
libvslvm.so.1"

inherit rpm
