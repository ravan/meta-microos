SUMMARY = "KIWI - Dracut module for vmx(+overlay) image type"
DESCRIPTION = "This package contains the kiwi-overlay dracut module which is used \
for booting vmx images built with KIWI and configured to use an \
overlay root filesystem"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-overlay-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "c2f2572b01e2af217dfb11fc71abe06c512d5dcadac88b8c76778ebd9be1439a2f61bea6a617ef5f16b5174283890664d3b89c3c7277f465d719f08922ba1755"

RPROVIDES:${PN} += "dracut-kiwi-overlay"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
dracut-kiwi-lib"

inherit rpm
