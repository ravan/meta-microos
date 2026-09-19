SUMMARY = "Set of unified programs capable of host isolation ('fencing')"
DESCRIPTION = "A collection of executables to handle isolation ('fencing') of possibly \
misbehaving hosts by the means of remote power management, blocking \
network, storage, or similar. \
 \
This package serves as a catch-all for all supported fence agents."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-all-4.17.0+git.1786356985.d90bec5f-1.1.aarch64.rpm"
RPM_HASH = "e68e630de0441b15836e4b6062bae13e4d017c4e859f2da6a72062613bcb9c2eb0852bcf76c1dc71bac6a4230990f9c4588f41a41777ef84d7066692b53e5d5d"

RPROVIDES:${PN} += "fence-agents \
fence-agents-all"

RDEPENDS:${PN} += "fence-agents-alom \
fence-agents-apc \
fence-agents-apc-snmp \
fence-agents-aws \
fence-agents-bladecenter \
fence-agents-brocade \
fence-agents-cisco-mds \
fence-agents-cisco-ucs \
fence-agents-drac5 \
fence-agents-eaton-snmp \
fence-agents-eaton-ssh \
fence-agents-emerson \
fence-agents-eps \
fence-agents-gce \
fence-agents-hds-cb \
fence-agents-hpblade \
fence-agents-ibm-powervs \
fence-agents-ibm-vpc \
fence-agents-ibmblade \
fence-agents-ibmz \
fence-agents-ifmib \
fence-agents-ilo-moonshot \
fence-agents-ilo-mp \
fence-agents-ilo-ssh \
fence-agents-ilo2 \
fence-agents-intelmodular \
fence-agents-ipdu \
fence-agents-ipmilan \
fence-agents-kdump \
fence-agents-lpar \
fence-agents-mpath \
fence-agents-netio \
fence-agents-nutanix-ahv \
fence-agents-redfish \
fence-agents-rsa \
fence-agents-rsb \
fence-agents-sanbox2 \
fence-agents-sbd \
fence-agents-scsi \
fence-agents-vbox \
fence-agents-vmware \
fence-agents-vmware-rest \
fence-agents-wti \
fence-agents-zvm"

inherit rpm
