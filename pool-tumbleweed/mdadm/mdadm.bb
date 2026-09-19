SUMMARY = "Utility for configuring 'MD' software RAID devices"
DESCRIPTION = "mdadm is a program that can be used to control Linux Software RAID (md) devices."
LICENSE = "GPL-2.0-only"

PV = "4.5+44.gf732de3f"

RPM_NAME = "mdadm-4.5+44.gf732de3f-1.3.aarch64.rpm"
RPM_HASH = "5c44ef8ff2b4b9b46d7dcb02a3e766d756bf407ec9aa920d240f8413973c73233ee0d0d1e075a1bb9eeb725208c61626e03fec8ffaa6ec0498cbc9ed5f2ad926"

RPROVIDES:${PN} += "mdadm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
