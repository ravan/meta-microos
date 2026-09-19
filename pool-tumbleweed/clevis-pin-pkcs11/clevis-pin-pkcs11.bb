SUMMARY = "PKCS\\#11 pin integration for Clevis"
DESCRIPTION = "Automatically unlocks LUKS block devices through a PKCS\\#11 device."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-pin-pkcs11-21-1.6.aarch64.rpm"
RPM_HASH = "142f55f55353fa9960d0e0d2f204425400e792d795fe7a9eae004cdb0eb18c059538dcb09ed56cb6579a740c3121993d227f0d38d1c8fe57c3b4f3dbadd27e21"

RPROVIDES:${PN} += "clevis-pin-pkcs11"

RDEPENDS:${PN} += "/usr/bin/bash \
clevis-luks \
ld-linux-aarch64.so.1 \
libc.so.6 \
opensc \
pcsc-lite"

inherit rpm
