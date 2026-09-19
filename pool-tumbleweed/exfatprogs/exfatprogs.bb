SUMMARY = "Utilities for exFAT file system maintenance"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.3"

RPM_NAME = "exfatprogs-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "01e184cc1f7aed7487f4a9c17560b34cb9fd6fcc9eca13139b28314ebc7608dddaf95358d254694780a2797f73681264402129b864b5673b7094a26301455396"

RPROVIDES:${PN} += "exfatprogs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6"

inherit rpm
