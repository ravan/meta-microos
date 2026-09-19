SUMMARY = "Generic Linux target framework (tgt)"
DESCRIPTION = "Linux target framework (tgt) aims to simplify various SCSI target \
driver (iSCSI, Fibre Channel, SRP, etc) creation and maintenance. \
 \
Tgt consists of kernel modules, user-space daemon, and user-space \
tools. Some target drivers uses all of them and some use only \
user-space daemon and tools (i.e. they completely runs in user space)."
LICENSE = "GPL-2.0-only"

PV = "1.0.97"

RPM_NAME = "tgt-1.0.97-1.3.aarch64.rpm"
RPM_HASH = "8ce28b291c87905622f0a70fde9551094c6bda0695acb305c5afadfbd7191dd2a91b4a4c540edb53a7ea33b8f28dbd66bf050a8c38a5b2d06150300bd910b5f3"

RPROVIDES:${PN} += "config-tgt \
tgt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libaio.so.1 \
libc.so.6 \
perl-Config-General \
systemd"

inherit rpm
