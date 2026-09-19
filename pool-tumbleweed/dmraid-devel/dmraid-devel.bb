SUMMARY = "Development files for dmraid"
DESCRIPTION = "This software discovers, activates, deactivates, and displays \
properties of software RAID sets, such as ATARAID, and contained DOS \
partitions. \
 \
dmraid uses libdevmapper and the device-mapper kernel runtime to create \
devices with respective mappings for the ATARAID sets discovered."
LICENSE = "GPL-2.0-only"

PV = "1.0.0.rc16.3"

RPM_NAME = "dmraid-devel-1.0.0.rc16.3-4.5.aarch64.rpm"
RPM_HASH = "efa7091f9aea565a2e3e2e40495b82c5517416c8769069d2f538d5b4d1b83554848e3a6df9f1986d88dc9945268dab2fdf546d504995d360fb237db0becc8278"

RPROVIDES:${PN} += "dmraid-devel"

RDEPENDS:${PN} += "dmraid"

inherit rpm
