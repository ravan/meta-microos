SUMMARY = "KIWI - Dracut module for disk with embedded verity metadata"
DESCRIPTION = "This package contains the kiwi-verity dracut module which is used \
for booting oem images built with KIWI and configured to use an \
embedded verity metadata block via the embed_verity_metadata \
type attribute"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-verity-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "1eb2881822351fce28a6959e6474a96d18c0d1c426c2a5f2e69b86c7d980518df44796a047f5a86c5316dd6e943d5b7bc5b4673010887fc0b3f5608db576b095"

RPROVIDES:${PN} += "dracut-kiwi-verity"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
dracut-kiwi-lib \
libc.so.6"

inherit rpm
