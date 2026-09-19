SUMMARY = "Linux Broadcom NetXtremem II iscsi server"
DESCRIPTION = "This tool is to be used in conjunction with the Broadcom NetXtreme II Linux \
driver (Kernel module name: 'bnx2' and 'bnx2x'), Broadcom CNIC driver, \
and the Broadcom iSCSI driver (Kernel module name: 'bnx2i'). \
This user-space tool is used in conjunction with the following \
Broadcom Network Controllers: \
 \
* bnx2:  BCM5706, BCM5708, BCM5709 devices \
* bnx2x: BCM57710, BCM57711, BCM57711E, BCM57712, BCM57712E, \
         BCM57800, BCM57810, BCM57840 devices \
 \
This utility will provide the ARP and DHCP functionality for the iSCSI offload. \
The communication to the driver is done via user-space I/O (Kernel module name \
'uio')."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.8.8"

RPM_NAME = "iscsiuio-0.7.8.8-113.1.aarch64.rpm"
RPM_HASH = "f47b38e97fc714089aada7118ddfdc4e5b35f79213b71c9e8927c9c40f5e75787c1bd100588ce116f1010d7942935ac646583155ee76f48f467e464442cb2087"

RPROVIDES:${PN} += "iscsiuio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
logrotate"

inherit rpm
