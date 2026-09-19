SUMMARY = "Library with NFS-safe locking functions"
DESCRIPTION = "This library implements a number of functions found in -lmail on SysV \
systems. These functions are designed to lock the standard mailboxes in \
/var/mail (or wherever the system puts them). \
 \
In addition, this library offers a number of functions to create, \
manage and remove generic lockfiles."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "liblockfile1-1.17-1.12.aarch64.rpm"
RPM_HASH = "09e4e61bd5f4782c52a47d03bbab9ddbd3a31f5db10f6e3d9cfa8f60f34884c047b9d24f6c922f6e2971dd1f6529685cabf8a2ef232105dbe4c834bb8392bce2"

RPROVIDES:${PN} += "liblockfile.so.1 \
liblockfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
