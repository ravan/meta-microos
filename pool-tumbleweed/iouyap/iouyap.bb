SUMMARY = "Bridge IOU to TAP, UDP and Ethernet"
DESCRIPTION = "Bridge IOU to TAP, UDP and Ethernet, mainly used by gns3server \
 \
In order to use iouyap as non-root user, the user needs to be member of the iouyap group!"
LICENSE = "GPL-3.0-or-later"

PV = "0.97"

RPM_NAME = "iouyap-0.97-3.10.aarch64.rpm"
RPM_HASH = "3da58437c7e0686d6f6d05187e0f20fe1f907dcacaf7f5b5e4ce5917c32187d1206f8b7498d4680d359742478bc5675c0ec3aaeb8c435d49d8c00b1c9c9f6b1f"

RPROVIDES:${PN} += "group-iouyap \
iouyap"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
permissions \
shadow"

inherit rpm
