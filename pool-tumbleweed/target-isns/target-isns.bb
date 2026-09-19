SUMMARY = "Supplies iSNS support for Linux kernel target"
DESCRIPTION = "Target-isns is an Internet Storage Name Service (iSNS) client for the \
Linux LIO iSCSI target. It allows to register LIO iSCSI targets to an \
iSNS server. \
 \
The iSNS protocol is specified in \
[RFC 4171](http://tools.ietf.org/html/rfc4171) and its purpose is to \
make easier to discover, manage, and configure iSCSI devices. With \
iSNS, iSCSI targets can be registered to a central iSNS server and \
initiators can be configured to discover the targets by asking the \
iSNS server."
LICENSE = "GPL-2.0-or-later"

PV = "v0.6.8+11.8a2bdcc"

RPM_NAME = "target-isns-v0.6.8+11.8a2bdcc-1.3.aarch64.rpm"
RPM_HASH = "fdbb1575c558e51eedb11aea35966d6d689ab76cc83c19e2ec694dddbd25086aaf939a319fdffc300331feefa1e87d12924b8129614c6f00667546a583437513"

RPROVIDES:${PN} += "config-target-isns \
target-isns"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
