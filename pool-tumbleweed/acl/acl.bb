SUMMARY = "Commands for Manipulating POSIX Access Control Lists"
DESCRIPTION = "getfacl and setfacl commands for retrieving and setting POSIX access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "acl-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "f5d639cabbe3c2691a1f5e8bb7a2aee665b2bb70d2f527283f64823009a3f1d489bac6911ccac25ff2bbe563ea7d53a1617d134ba5d332c2557a15ce5dce1d62"

RPROVIDES:${PN} += "acl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6"

inherit rpm
