SUMMARY = "The iSCSI User-level Library"
DESCRIPTION = "The iSCSI user-space API from the open-iscsi project."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libopeniscsiusr0-0.2.0-113.1.aarch64.rpm"
RPM_HASH = "8615bdcf5733fd3d6693c6a9e99d90d499c281ff28349144c8a96b45651301ebe4614007c23e9a1ab71313ec90a6aa66cd253f517cfc083d35c1330c9c642ad3"

RPROVIDES:${PN} += "libopeniscsiusr.so.0 \
libopeniscsiusr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2"

inherit rpm
