SUMMARY = "Dracut module for supporting transactional updates"
DESCRIPTION = "This package contains the dracut modules for handling early boot aspects \
for transactional updates."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "dracut-transactional-update-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "5cf651a317abc6499b19b36cb75de6849f4b38368816e3261540d25fce9b1adab891281e25176ec000a8748924f83c70fc9be194a30b671ec66fc366a867bec3"

RPROVIDES:${PN} += "dracut-transactional-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
tukit"

inherit rpm
